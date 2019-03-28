/**
 * @author Yinbin Zuo
 * @date March 24th, 2019
 */

package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtn {

	public static void main(String[] args) {
		// setting system property path for webdriver
		String exePath = "/Applications/chromedriver";
		System.setProperty("webdriver.chrome.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new ChromeDriver();
		// enter a website address for opening
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		// get the list by the name of sex 
		List<WebElement> sexList = driver.findElements(By.name("sex"));
		for(WebElement sex: sexList){
			// select the deselected Radio button for category Sex
			if(!sex.isSelected()){
				sex.click();
				break;
			}
		}
		
		// get the list by the name of exp 
		List<WebElement> expList = driver.findElements(By.name("exp"));
		for(int i = 0;i < expList.size();i ++){
			// select the Third radio button for category ‘Years of Exp’
			if(!expList.get(i).isSelected() && i == 2){
				expList.get(i).click();
				break;
			}
		}
		
		// get the list by the name of profession
		List<WebElement> professionList = driver.findElements(By.name("profession"));
		for(int i = 0;i < professionList.size();i ++){
			// check the Check Box ‘Automation Tester’ for category ‘Profession'
			if(!professionList.get(i).isSelected() && professionList.get(i).getAttribute("value").equalsIgnoreCase("Automation Tester")){
				professionList.get(i).click();
				break;
			}
		}
		
		// get the list by the css selector of the name of tool
		List<WebElement> toolList = driver.findElements(By.cssSelector("input[name='tool']"));
		for(int i = 0;i < toolList.size();i ++){
			// check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’
			if(!toolList.get(i).isSelected() && toolList.get(i).getAttribute("value").equalsIgnoreCase("Selenium IDE")){
				toolList.get(i).click();
				break;
			}
		}
		
		// close window
		driver.close();
	}

}
