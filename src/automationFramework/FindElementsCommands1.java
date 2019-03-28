/**
 * @author Yinbin Zuo
 * @date Mar 18th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FindElementsCommands1 {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		// define a locator and store first name in the locator
		By firstNameLocator = By.name("firstname");
		// define a web element and store element through findElement method
		WebElement fnameElement = driver.findElement(firstNameLocator);
		// send the typing by the web element
		fnameElement.sendKeys("Yinbin");
		// define a locator and store last name in the locator
		By lastNameLocator = By.name("lastname");
		// define a web element and store element through findElement method
		WebElement lnameElement = driver.findElement(lastNameLocator);
		// send the typing by the web element
		lnameElement.sendKeys("Zuo");
		// define a locator and store submit button in the locator
		By submitLocator = By.name("submit");
		// define a web element and store element through findElement method
		WebElement submitElement = driver.findElement(submitLocator);
		// trigger clicking event
		submitElement.click();
		// exit driver
//		driver.close();
	}

}
