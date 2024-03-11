package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtility;

public class EnterprisePage extends BasePage {
	
	public EnterprisePage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	String[] data=ExcelUtility.read();
	
	
	//Locating Elements:-
	@FindBy(xpath="//h3[text()='More']")
	WebElement More;
	
	@FindBy(xpath="//a[text()='What We Offer']")
	WebElement Product;
	
	@FindBy(xpath="//h1[@id='falseCourseraForCampus']")
	WebElement Campus;
	
	@FindBy(xpath="(//span[text()='Learn more'])[2]")
	WebElement LearnMore;
	
	@FindBy(xpath="(//h2[@class='cds-119 css-13rt5ey cds-121'])[4]")
	WebElement SalesTeam;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Phone']")
	WebElement PhoneNo;
	
	@FindBy(xpath="//select[@id='Institution_Type__c']")
	WebElement InstituteType;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement InstituteName;
	
	@FindBy(xpath="//select[@id='Title']")
	WebElement JobRole;
	
	@FindBy(xpath="//select[@id='Department']")
	WebElement Department;
	
	@FindBy(xpath="//select[@id='What_the_lead_asked_for_on_the_website__c']")
	WebElement Describe;
	
	@FindBy(xpath="//select[@id='Self_reported_employees_to_buy_for__c']")
	WebElement Learner;
	
	@FindBy(xpath="//select[@id='Country']")
	WebElement Country;
	
	@FindBy(xpath="//select[@id='State']")
	WebElement State;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//div[@id='ValidMsgEmail']")
	WebElement Invalid;
	
	
	//Action method:
	public void scrollMore() {
		
		js.executeScript("arguments[0].scrollIntoView();",More);
	}
	
	public void clickWhatWeOffer() {
		
		js.executeScript("arguments[0].click();",Product);
	}
	
	public void scrollCampus() {
		
		js.executeScript("arguments[0].scrollIntoView();",Campus);
	}
	
	public void clickLearnMore() {
		
		LearnMore.click();
	}
	
	public void scrollSalesTeam() {
		
		js.executeScript("arguments[0].scrollIntoView();",SalesTeam);
	}
	
	public void setFirstName() {
		
		FirstName.sendKeys(data[2]);
	}
	
	public void setLastName() {
		
		LastName.sendKeys(data[3]);
	}
	
	public void setEmailAddress() {
		
		Email.sendKeys(data[4]);
	}
	
	public void printInvalidEmail() {
		
		System.out.println("The Status Of Email Address is: ");
		String invalid=Invalid.getText();
		System.out.println(invalid);
		System.out.println();
	}
	
	public void setPhoneNo() {
		
		PhoneNo.sendKeys(data[5]);
	}
	
	public void selectInstituteType() {
		
		Select type=new Select(InstituteType);
		type.selectByVisibleText("University/4 Year College");
	}
	
	public void setInstituteName() {
		
		InstituteName.sendKeys(data[6]);
	}
	
	public void selectJobRole() {
		
		Select role=new Select(JobRole);
		role.selectByVisibleText("Professor");
	}
	
	public void selectDepartment() {
		
		Select depart=new Select(Department);
		depart.selectByVisibleText("Teaching/Faculty/Research");
	}
	
	public void selectDescribe() {
		
		Select describes=new Select(Describe);
		describes.selectByVisibleText("Meet with Coursera Sales Team");
	}
	
	public void selectExpectedLearner() {
		
		Select learners=new Select(Learner);
		learners.selectByVisibleText("5-25");
	}
	
	public void selectCountry() {
		
		Select country=new Select(Country);
		country.selectByVisibleText("India");
	}
	
	public void selectState() {
		
		Select state=new Select(State);
		state.selectByVisibleText("Tamil Nadu");
	}
	
	public void clickSubmit() {
		
		js.executeScript("arguments[0].click();",Submit);
	}
}
