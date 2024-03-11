package stepDefinition;

import java.io.IOException;

import factory.DriverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePage;
import pageObjectModel.FirstPage;

public class FirstStep {
	
	
	public HomePage CHP;
	public FirstPage WDP;
	
	@Given("the user navigate to Coursera Home page")
	public void the_user_navigate_to_coursera_home_page() {
	   
		DriverClass.getLogger().info("Navigated to Coursera Home Page");
		CHP=new HomePage(DriverClass.getDriver());
		WDP=new FirstPage(DriverClass.getDriver());
	}

	@When("the user enter Web Development in SearchBox")
	public void the_user_enter_web_development_in_search_box() {
	    CHP.sendCourseName();
	    DriverClass.getLogger().info("Successfully entered Web Development course");
	    
	    CHP.SearchButton();
	    DriverClass.getLogger().info("Clicked the Search Button");
	}

	@When("the user click the English language checkbox")
	public void the_user_click_the_english_language_checkbox() {
	    WDP.scrollSubject();
	    DriverClass.getLogger().info("Scrolled till the Subject checkbox");
	    
	    WDP.clickEnglish();
	    DriverClass.getLogger().info("Successfully clicked the English Language");
	}

	@When("the user clicked Beginner level checkbox")
	public void the_user_clicked_beginner_level_checkbox() {
	    WDP.scrollSpecific();
	    DriverClass.getLogger().info("Scrolled till the Specific chechbox");
	    
	    WDP.clickBeginner();
	    DriverClass.getLogger().info("Successfully clicked the Beginner level");
	}

	@Then("the user get the First Course Name and Click it")
	public void the_user_get_the_first_course_name_and_click_it() throws IOException {
		WDP.scrollFilter();
		DriverClass.getLogger().info("Scrolled till the Filter Heading");
		
		WDP.verifyCourse1();
		DriverClass.getLogger().info("Successfully verified and Clicked Course one");
	}

	@Then("the user get the Rating and Duration of First Course")
	public void the_user_get_the_rating_and_duration_of_first_course() throws IOException {
		WDP.childPage(DriverClass.getDriver());
		DriverClass.getLogger().info("Navigated to the child page");
		
		WDP.verifyRating1();
		DriverClass.getLogger().info("Successfully verified Rating one");
		
		WDP.verifyDuration1();
		DriverClass.getLogger().info("Successfully verified Duration One");
		
		WDP.parentPage(DriverClass.getDriver());
		DriverClass.getLogger().info("Navigated to the parent page");
	}

	@Then("the user get the Second Course name and Click it")
	public void the_user_get_the_second_course_name_and_click_it() throws IOException {
		WDP.verifyCourse2();
		DriverClass.getLogger().info("Successfully verified the Second Course and Clicked it");
	}

	@Then("the user get the Rating and Duration of Second Course")
	public void the_user_get_the_rating_and_duration_of_second_course() throws IOException {
	    WDP.childPage(DriverClass.getDriver());
	    DriverClass.getLogger().info("Navigated to the child page");
	    
		WDP.scrollFinancial();
		DriverClass.getLogger().info("Scrolled till the Financial Heading");
		
	    WDP.verifyRating2();
	    DriverClass.getLogger().info("Successfully verified the Rating Two");
	    
	    WDP.verifyDuration2();
	    DriverClass.getLogger().info("Successfully verified the Duration Two");
	    
	    WDP.parentPage(DriverClass.getDriver());
	    DriverClass.getLogger().info("Navigated to the Parent page");
	}
}
