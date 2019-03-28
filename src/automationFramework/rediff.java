/**
 * @author Yinbin Zuo
 * @date March 17th, 2019
 */

package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new ChromeDriver();
		// enter a website address for opening
		driver.get("http://rediff.com");
		// trigger sign in event
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		// get element by email id and send user name
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		// get element by xpath and send password
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("goodbye");
		// get element by xpath and trigger login event
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		// set timeout
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
}
