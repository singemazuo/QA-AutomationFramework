/**
 * @author Yinbin Zuo
 * @date March 25th, 2019
 */

package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRecap {

	public static void main(String[] args) throws InterruptedException {
		// setting system property path for webdriver
		String exePath = "C:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",exePath);
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		// enter a website address for opening
		driver.get("http://automationpractice.com/index.php");
		
		// get women by css selector
		WebElement womenElement = driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a"));
		// trigger clicking on event with womenElement object
		womenElement.click();
		
		// get top element by css selector
		WebElement topElement = driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[1]/a"));
		// trigger clicking on event with topElement object
		topElement.click();
		
		// get t-shirt element by css selector and trigger clicking on event
		driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[1]/a")).click();
		
		// go back one browser page
		driver.navigate().back();
		
		// get blouses element by css selector and trigger clicking on event
		driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[2]/a")).click();
		
		// get the list of blouses
		List<WebElement> blousesList = driver.findElements(By.cssSelector("#center_column > ul > li a.product_img_link"));
		for (WebElement blouse : blousesList) {
			// clicking on the first blouse
			blouse.click();
			// get out of this loop
			break;
		}
		
		// switch to the iframe
		driver.switchTo().frame(0);
		
		// get the quantity element by name and send text to 2
		driver.findElement(By.xpath("//*[@id='quantity_wanted']")).sendKeys("2");
		
		// get the size element by id and put in the select
		Select sizeSelector = new Select(driver.findElement(By.id("group_1")));
		for (WebElement option : sizeSelector.getOptions()) {
			if(option.getAttribute("title").equalsIgnoreCase("M")){
				// select Medium size option and get out this loop
				sizeSelector.selectByValue(option.getAttribute("value"));
				break;
			}
		}
		
		// get add to cart button and clicking on
		driver.findElement(By.name("Submit")).click();
		
		// sleep 3 seconds for waiting page refreshing
		Thread.sleep(3000);
		
		// get proceed button and clicking on
		driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")).click();
		
		// on the next page, get proceed button and clicking on
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]")).click();
		
		// get the email input element and send a fake email
		driver.findElement(By.id("email_create")).sendKeys("dev@gmail.com");
		
		// get the submit create element and clicking on
		driver.findElement(By.id("SubmitCreate")).click();
		
		// sleep 3 seconds for waiting page refreshing
		Thread.sleep(3000);
		
		// get the gender radio list
		List<WebElement> genderList = driver.findElements(By.name("id_gender"));
		for (WebElement gender : genderList) {
			// clicking on the first radio and get out this loop
			gender.click();
			break;
		}
		
		// get the first name of customer input and send the fake data
		driver.findElement(By.id("customer_firstname")).sendKeys("Dev");
		
		// get the last name of customer input and send the fake data
		driver.findElement(By.id("customer_lastname")).sendKeys("Dev");
		
		// get password input and send the fake password
		driver.findElement(By.id("passwd")).sendKeys("dev1234");
		
		// get days selector and select 5th option
		Select daysSelector = new Select(driver.findElement(By.id("days")));
		daysSelector.selectByIndex(5);
		
		// get months selector and select 6th option
		Select monthsSelector = new Select(driver.findElement(By.id("months")));
		monthsSelector.selectByIndex(6);
		
		// get months selector and select 6th option
		Select yearsSelector = new Select(driver.findElement(By.id("years")));
		yearsSelector.selectByIndex(6);
		
		// get newsletter checkbox and clicking on
		driver.findElement(By.id("newsletter")).click();
		
		// get optin checkbox and clicking on
		driver.findElement(By.id("optin")).click();
		
		// get first name of address and send fake data
		driver.findElement(By.id("firstname")).sendKeys("Dev");
		
		// get last name of address and send fake data
		driver.findElement(By.id("lastname")).sendKeys("Dev");
		
		// get first address input and filling fake data up
		driver.findElement(By.id("address1")).sendKeys("1234 Mountain Street");
		
		// get city input and filling fake data up
		driver.findElement(By.id("city")).sendKeys("Moncton");
		
		// get state selector and select the first option
		new Select(driver.findElement(By.id("id_state"))).selectByIndex(1);
		
		// get post code input and filling fake data up
		driver.findElement(By.id("postcode")).sendKeys("36003");
		
		// get mobile phone number input and filling fake data up
		driver.findElement(By.id("phone_mobile")).sendKeys("5556667777");
		
		// submit account
		driver.findElement(By.id("submitAccount")).click();
		
		// proceed button
		driver.findElement(By.name("processAddress")).click();
		
		// select terms of service
		driver.findElement(By.id("cgv")).click();
		
		// clicking on checkout button
		driver.findElement(By.name("processCarrier")).click();
		
		// get total price and print out on the console
		System.out.println(driver.findElement(By.id("total_price")).getText());
		
		// close browser
		driver.close();
	}

}
