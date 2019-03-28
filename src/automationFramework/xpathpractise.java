/**
 * @author Yinbin Zuo
 * @date March 17th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractise {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new ChromeDriver();
		// enter a website address for opening
		driver.get("https://login.salesforce.com/?locale=eu");
		// get element by email id and send email address
		driver.findElement(By.cssSelector("#username")).sendKeys("dev@gmail.com");
		// get element by xpath and send password
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("dev1234");
		// get element by xpath and trigger login event
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
