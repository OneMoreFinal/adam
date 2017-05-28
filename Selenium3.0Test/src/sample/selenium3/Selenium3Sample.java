package sample.selenium3;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium3Sample {
	@Test
	public void firefoxTest() {
		System.setProperty("webdriver.gecko.driver", "./exe/geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(cap);
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium3");
		driver.findElement(By.name("btnK")).click();
		if(driver!=null) {
			driver.close();
		}
	}
}