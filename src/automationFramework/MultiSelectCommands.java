/**
 * @author Yinbin Zuo
 * @date March 24th, 2019
 */

package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCommands {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		// instantiate select with element by name locator
		Select select = new Select(driver.findElement(By.name("selenium_commands")));
		// select by index which is zero
		select.selectByIndex(0);
		// deselect by index which is zero
		select.deselectByIndex(0);
		// select by index which is one
		select.selectByIndex(1);
		// deselect by index which is one
		select.deselectByIndex(1);
		
		// select all the options
		for (int i = 0; i < select.getOptions().size(); i++) {
			select.selectByIndex(i);
		}
		
		// print all selected options
		for (int j = 0; j < select.getAllSelectedOptions().size(); j++) {
			System.out.println(select.getAllSelectedOptions().get(j));
		}
		
		// deselect all options
		select.deselectAll();
		
		// close window
		driver.close();
	}

}
