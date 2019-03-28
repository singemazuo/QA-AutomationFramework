package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/***
 * 
 * @author Yinbin Zuo
 * @date Mar 9th, 2019
 * 
 */
public class BrowserCommands1TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		// setting system property path for webdriver
		System.setProperty("webdriver.gecko.driver","/Applications/geckodriver");
		
		// instantiate a specific driver for webdriver
		WebDriver driver = new FirefoxDriver();
		
		// enter a website address for opening
		driver.get("http://www.elections.ca/home.aspx");
		
		// get page tile
		String title = driver.getTitle();
		// print page title and title length on eclipse console
		System.out.println("Page title:"+title);
		System.out.println("Title length:"+title.length());
		
		// get current url
		String currentUrl = driver.getCurrentUrl();
		// get window url to verify the page has been opened
		String handle = driver.getWindowHandle();
		if(handle.length() > 0){
			System.out.println("Current Url:"+currentUrl);
		}
		
		// get page source
		String pageSource = driver.getPageSource();
		// output page source length and content
		System.out.println("Page Source Length: "+pageSource.length());
		System.out.println("Page Source:");
		System.out.println(pageSource);
		
		// thread sleeps 5000 milliseconds
		Thread.sleep(5000);
		
		// quit driver and close procedure
		driver.quit();
	}

}
