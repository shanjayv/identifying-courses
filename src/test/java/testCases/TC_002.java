package testCases;

import java.io.IOException;

import org.testng.annotations.*;

import pageObjectModel.HomePage;
import pageObjectModel.SecondPage;
import testBase.BaseClass;

public class TC_002 extends BaseClass {
	
	@Test(priority=0,groups= {"regression"})
	public void enterNewCourse() 
	{	
		logger.info("**** Starting TC_002_LanguageLearningTest ****");
		
		HomePage CH=new HomePage(driver);
		
		CH.clearCourseName();
		logger.info("Successfully Cleared The Course Name And Entered New Course");
		
		CH.SearchButton();;
		logger.info("Clicked Search Button");
	}
	
	
	@Test(priority=1,groups= {"sanity","regression"})
	public void clickShowMore() 
	{	
		SecondPage LLP=new SecondPage(driver);
		
		LLP.scrollScience();
		logger.info("Scrolled Till Science");
		
		LLP.clickShowMore();
		logger.info("Clicked Show More in Language CheckBox");
	}
	
	
	@Test(priority=2,groups= {"sanity","regression"})
	public void printTotalLangs() throws IOException 
	{
		SecondPage LLP=new SecondPage(driver);
		
		LLP.clickEnglish();
		logger.info("Unclicking The English Language");
		
		LLP.verifyTotalLang();
		logger.info("Successfully Printing Total");
		
		LLP.clickClose();
		logger.info("Clicked Close Button in All Language Box");
	}
	
	
	@Test(priority=3,groups= {"regression"})
	public void printTotalLevels() throws IOException
	{
		SecondPage LLP=new SecondPage(driver);
		
		LLP.scrollUniversity();
		logger.info("Scrolled Till University CheckBox");
		
		LLP.verifyTotalLevel();
		logger.info("Successfully Printed All The Levels");
		logger.info("**** Finished TC_002_LanguageLearningTest ****");
	}

}
