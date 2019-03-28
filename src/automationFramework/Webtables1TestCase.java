/**
 * @author Yinbin Zuo
 * @date March 24th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Webtables1TestCase {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		// get text with td xpath
		String dubaiValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		// print the dubai value
		System.out.println(dubaiValue);
		
		// find the a tag and clicking on
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]")).findElement(By.linkText("details")).click();
		
		// close browser
		driver.close();
	}

}
