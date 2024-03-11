package pageObjectModel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class SecondPage extends BasePage{
	
	public SecondPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
	//Locating Elements
	@FindBy(xpath="(//span[text()='Computer Science'])[2]")
	WebElement Science;
	
	@FindBy(xpath="//button[@aria-label='Show more Language options']")
	WebElement ShowMore;
	
	@FindBy(xpath="(//span[text()='English'])[1]")
	WebElement EnglishLang;
	
	@FindBy(xpath="//div[@id='checkbox-group']//div[@class='cds-checkboxAndRadio-labelText']")
	List<WebElement> TotalLang;
	
	@FindBy(xpath="//button[@class='cds-149 cds-button-disableElevation cds-button-ghost css-1s96oj']")
	WebElement CloseButton;
	
	@FindBy(xpath="(//span[text()='University Certificates'])[2]")
	WebElement University;
	
	@FindBy(xpath="//div[@data-testid='search-filter-group-Level']//div/span/span[text()]")
	List<WebElement> TotalLevel;
	
	@FindBy(xpath="//a[@aria-label='Coursera']")
	WebElement Title;
	
	
	//Action Method:-
	public void scrollScience() {
		
		js.executeScript("arguments[0].scrollIntoView();",Science);
	}
	
	public void clickShowMore() {
		
		ShowMore.click();
	}
	
	public void clickEnglish() {
		
		js.executeScript("arguments[0].click();",EnglishLang);
	}
	
	public void verifyTotalLang() throws IOException {
		
		int row = 0;
		System.out.println("The Languages are:");
		for(WebElement Langs:TotalLang) {
			System.out.println(Langs.getText());
			ExcelUtility.write("Sheet1", row, 2, Langs.getText());
			row++;
		}
		
		System.out.println();
		int count=TotalLang.size();
		System.out.println("The Total No of Languages:"+count);
		System.out.println();
	}	
	
	public void clickClose() {
		
		CloseButton.click();
	}
	
	public void scrollUniversity() {
		
		js.executeScript("arguments[0].scrollIntoView();",University);
	}
	
	public void verifyTotalLevel() throws IOException {
		
		int row=0;
		System.out.println("The Levels are:");
		for(WebElement Levels:TotalLevel) {
			System.out.println(Levels.getText());
			ExcelUtility.write("Sheet1", row, 3,Levels.getText());
			row++;
		}
		System.out.println();
		int count1=TotalLevel.size();
		System.out.println("The Total No of Levels:"+count1);
		System.out.println();
	}
	
	public void clickTitle() {
		
		Title.click();
	}

}
