package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	Actions a = new Actions(driver);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	String[] data=ExcelUtility.read();
	
	
	//Locating Elements:
	@FindBy(xpath="//input[@role='textbox']")
	WebElement SearchBox;
	
	@FindBy(xpath="(//div[@class='magnifier-wrapper'])[2]")
	WebElement SearchButton;
	
	@FindBy(xpath="//p[text()='Community']")
	WebElement Community;
	
	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement Enterprise;
	
	
	//Action Method:-
	public void sendCourseName() {
		
		SearchBox.sendKeys(data[0]);
	}
	
	public void clearCourseName() {
		
		SearchBox.click();
		a.moveToElement(SearchBox).keyDown(Keys.CONTROL);
		a.sendKeys("a").keyUp(Keys.CONTROL).perform();
		a.sendKeys(Keys.DELETE);
		SearchBox.sendKeys(data[1]);
		SearchBox.sendKeys(Keys.ENTER);
	}
	
	public void SearchButton() {
		
		SearchButton.click();
	}
	
	public void scrollToBottom() {
		
		js.executeScript("arguments[0].scrollIntoView();",Community);
	}
	
	public void clickForEnterprise() {
		
		js.executeScript("arguments[0].click();",Enterprise);
	}

}
