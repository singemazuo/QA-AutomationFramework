/**
 * @author Yinbin Zuo
 * @date March 17th, 2019
 */

package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdowns {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "/Applications/geckodriver";
		System.setProperty("webdriver.gecko.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new FirefoxDriver();
		// enter a website address for opening
		driver.get("http://spicejet.com/");
		// get all dropdown element excepting adult
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		// select the Indian Armed Forces checkbox
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		// set timeout
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

}
