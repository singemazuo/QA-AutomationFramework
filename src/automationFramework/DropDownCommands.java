/**
 * @author Yinbin Zuo
 * @date March 24th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommands {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		// get the select element and create selection object with it
		Select continentSelect = new Select(driver.findElement(By.name("continents")));
		// select an option with index
		continentSelect.selectByIndex(1);
		// select an option with visible text
		continentSelect.selectByVisibleText("Africa");
		// print all selected options
		System.out.println(continentSelect.getAllSelectedOptions());
		// select by my choice
		continentSelect.selectByIndex(3);
		
		// close window
		driver.close();
	}

}
