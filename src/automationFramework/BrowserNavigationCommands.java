/**
 * @author Yinbin Zuo
 * @date March 18th, 2019
 */


package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("https://www.ultimateqa.com/complicated-page/");
		// clicking on the first twitter symbol
		String currentURL = driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id='et-boc']/div/div/div[5]/div[1]/ul[1]/li/a")).click();
		// go back by history
		driver.navigate().back();
		// go forward by history
		driver.navigate().forward();
		// to specific page
		driver.navigate().to(currentURL);
		// refersh page
		driver.navigate().refresh();
		// exit driver
		driver.close();
	}

}
