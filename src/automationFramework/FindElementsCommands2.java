/**
 * @author Yinbin Zuo
 * @date Mar 18th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FindElementsCommands2 {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		// define a locator and store the element contains 'Partial' in the locator
		By partialLinkTest = By.partialLinkText("Partial");
		// define a web element and store element through findElement method
		WebElement partialLinkTestElement = driver.findElement(partialLinkTest);
		// trigger clicking event
		partialLinkTestElement.click();
		
		// define a locator and store submit button in the locator
		By submitButtonLocator = By.tagName("button");
		// define a web element and store element through findElement method
		WebElement submitButtonElement = driver.findElement(submitButtonLocator);
		// output button on the console pane
		System.out.println(submitButtonElement.toString());
		System.out.println(submitButtonElement.getAttribute("type").toString());
		
		// define a locator and store link test in the locator
		By linkTest = By.linkText("Link Test");
		// define a web element and store element through findElement method
		WebElement linkTestElement = driver.findElement(linkTest);
		// trigger clicking event
		linkTestElement.click();
		
		// close browser window
		driver.close();
	}

}
