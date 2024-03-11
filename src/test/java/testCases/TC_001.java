package testCases;

import java.io.IOException;

import org.testng.annotations.*;
import pageObjectModel.HomePage;
import pageObjectModel.FirstPage;
import testBase.BaseClass;

public class TC_001 extends BaseClass {
	
	@Test(priority=0, groups= {"sanity"})
	public void enterCourseName()
	{
		logger.info("**** Starting TC_001_WebDevelopmentTest ****");
		
		HomePage CHP=new HomePage(driver);
		
		CHP.sendCourseName();
		logger.info("Course Name Sent Successfully");
		
		CHP.SearchButton();
		logger.info("Clicked on Search Button");
	}
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void clickLanguage() 
	{	
		FirstPage WDP=new FirstPage(driver);
		
		WDP.scrollSubject();
		logger.info("Scrolled Till Subject");
		
		WDP.clickEnglish();
		logger.info("Clicked English Language");
	}
	
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void clickLevel() 
	{
		FirstPage WDP=new FirstPage(driver);
		
		WDP.scrollSpecific();
		logger.info("Scrolled Till Specific");
		
		WDP.clickBeginner();
		logger.info("Clicked Begginer CheckBox");
	}
	
	
	@Test(priority=3,groups= {"sanity","regression"})
	public void printCourse1() throws IOException 
	{
		FirstPage WDP=new FirstPage(driver);
		
		WDP.scrollFilter();
		logger.info("Scrolled Till Filter");
		
		WDP.verifyCourse1();
		logger.info("Course One is Clicked and Successfully Printed");
	}
	
	
	@Test(priority=4,groups= {"regression"})
	public void printDetails1() throws IOException
	{
		FirstPage WDP=new FirstPage(driver);
		
		WDP.childPage(driver);
		logger.info("Switched To First Course Name");
		
		WDP.verifyRating1();
		logger.info("Successfully Printed Rating of Course One");
		
		WDP.verifyDuration1();
		logger.info("Successfully Printed Duration of Course One");
		
		WDP.parentPage(driver);
		logger.info("Switched To Parent Page");
	}
	
	
	@Test(priority=5,groups= {"sanity","regression"})
	public void printCourse2() throws IOException
	{
		FirstPage WDP=new FirstPage(driver);
		
		WDP.verifyCourse2();
		logger.info("Course One is Clicked and Successfully Printed");
	}
	
	
	@Test(priority=6,groups= {"regression"})
	public void printDetails2() throws IOException
	{
		FirstPage WDP=new FirstPage(driver);
		
		WDP.childPage(driver);
		logger.info("Switched To The Second Course Page");
		
		WDP.scrollFinancial();
		logger.info("Scrolled till Financial");
		
		WDP.verifyRating2();
		logger.info("Successfully Printed Rating of Course Two");
		
		WDP.verifyDuration2();
		logger.info("Successfully Printed Duration of Course Two");
		
		WDP.parentPage(driver);
		logger.info("Switched To The Parent Page");
		logger.info("**** Finishing TC_001_WebDevelopmentTest ****");
	}
}
