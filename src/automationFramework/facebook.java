/**
 * @author Yinbin Zuo
 * @date March 17th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new ChromeDriver();
		// enter a website address for opening
		driver.get("http://facebook.com");
//		driver.findElement(By.name("email")).sendKeys("singemazuo@gmail.com");
//		driver.findElement(By.id("email")).sendKeys("singemazuo@gmail.com");
		// get element by email id and send email address
		driver.findElement(By.cssSelector("#email")).sendKeys("dev@gmail.com");
		// get element by xpath and send password
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("dev1234");
		// get element by xpath and trigger clicking event
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	}

}
