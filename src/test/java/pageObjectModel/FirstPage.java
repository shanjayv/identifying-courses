package pageObjectModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class FirstPage extends BasePage{
	
	public FirstPage(WebDriver driver) {
		super(driver);
	}
	
	public Set<String> windowIds;
	public List<String> window;
	public String parent;
	public String child;
	
	Actions a = new Actions(driver);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
	//Locating Elements:-
	@FindBy(xpath="//input[@class='react-autosuggest__input']")
	WebElement InputBox;
	
	@FindBy(xpath="//input[@role='textbox']")
	WebElement Subject;
	
	@FindBy(xpath="(//span[text()='English'])[1]")
	WebElement Language;
	
	@FindBy(xpath="//span[text()='Specializations']")
	WebElement Specific;

	@FindBy(xpath="//span[text()='Beginner']")
	WebElement Beginner;
	  
	@FindBy(xpath="//h3[text()='Filter by']")
	WebElement Filter;
	
	@FindBy(xpath="//h3[text()='Meta Front-End Developer']")
	WebElement Course1;
	
	@FindBy(xpath="(//div[starts-with(@class,'cds-119 cds-Typography-base css-h')])[6]")
	WebElement Rating1;
	
	@FindBy(xpath="(//div[starts-with(@class,'cds-119 cds-Typography-base css-h')])[8]")
	WebElement Duration1;
	
	@FindBy(xpath="//h3[text()='Introduction to Web Development']")
	WebElement Course2;
	
	@FindBy(xpath="//button[@class='button-link finaid-link']")
	WebElement Financial;
	
	@FindBy(xpath="(//div[starts-with(@class,'cds-119 cds-Typography-base css-h')])[1]")
	WebElement Rating2;
	
	@FindBy(xpath="(//div[starts-with(@class,'cds-119 cds-Typography-base css-h')])[3]")
	WebElement Duration2;
 
	
	//Action Method:-
	public void scrollSubject() {
		
		js.executeScript("arguments[0].scrollIntoView();",Subject);
	}
	
	public void clickEnglish() {
		
		Language.click();
	}
	
	public void scrollSpecific() {
		
		js.executeScript("arguments[0].scrollIntoView();",Specific);
	}
	
	public void clickBeginner() {
		
		Beginner.click();
	}
	
	public void scrollFilter() {
		
		js.executeScript("arguments[0].scrollIntoView();",Filter);
	}
	
	public void verifyCourse1() throws IOException {
		
		System.out.println("The Course Details Are:");
		String CourseName = Course1.getText();
		a.moveToElement(Course1).click().perform();
		System.out.println("First Course Name: "+CourseName);
		ExcelUtility.write("Sheet1", 0, 0, CourseName);
	}
	
	public void verifyRating1() throws IOException {
		String RatingOne=Rating1.getText();
		System.out.println("Rating Of First Course: "+RatingOne);
		ExcelUtility.write("Sheet1", 1, 0, RatingOne);
	}
	
	public void verifyDuration1() throws IOException {
		String DurationOne=Duration1.getText();
		System.out.println("Duration Of First Course: "+DurationOne);
		ExcelUtility.write("Sheet1", 2, 0, DurationOne);
		
	}
	
	public void verifyCourse2() throws IOException {
		String CourseName2 = Course2.getText();
		a.moveToElement(Course2).click().perform();
		System.out.println("Second Course Name: "+CourseName2);
		ExcelUtility.write("Sheet1", 0, 1, CourseName2);
	}
	
	public void scrollFinancial() {
		
		js.executeScript("arguments[0].scrollIntoView();",Financial);
	}
	
	public void verifyRating2() throws IOException {
		String RatingTwo=Rating2.getText();
		System.out.println("Rating Of Second Course: "+RatingTwo);
		ExcelUtility.write("Sheet1", 1, 1, RatingTwo);
	}
	
	public void verifyDuration2() throws IOException {
		String DurationTwo=Duration2.getText();
		System.out.println("Duration Of Second Course: "+DurationTwo);
		ExcelUtility.write("Sheet1", 2, 1, DurationTwo);
		System.out.println();
	}
	 
	public void childPage(WebDriver driver) {
		windowIds=driver.getWindowHandles();
		window=new ArrayList<String>(windowIds);
		parent=window.get(0);
		child=window.get(1);
		driver.switchTo().window(child);
	}
	
	public void parentPage(WebDriver driver) {
		driver.close();
		driver.switchTo().window(parent);
	}
	

}
