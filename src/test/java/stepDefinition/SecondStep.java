package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.DriverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePage;
import pageObjectModel.SecondPage;

public class SecondStep {
	
	WebDriver driver;
	public HomePage CHP;
	public SecondPage LLP;
	
	@Given("the user is on the Web Development page")
	public void the_user_is_on_the_web_development_page() {
		DriverClass.getLogger().info("***** Test Case Two Started successfully *****");
	    CHP=new HomePage(DriverClass.getDriver());
	    LLP=new SecondPage(DriverClass.getDriver());
	}

	@When("the user set Language Learning in Searchbox")
	public void the_user_set_Language_Learning_in_Searchbox() {
	    CHP.clearCourseName();
	    DriverClass.getLogger().info("New Course Name has been entered in the SearchBox");
	    
	    CHP.SearchButton();
	    DriverClass.getLogger().info("Successfully clicked the Search Button");
	}

	@When("the user click the ShowMore in languages")
	public void the_user_click_the_ShowMore_in_languages() {
	    LLP.scrollScience();
	    DriverClass.getLogger().info("Scrolled till the Science checkbox");
	    
	    LLP.clickShowMore();
	    DriverClass.getLogger().info("Successfully clicked the Show More option in Languages");
	}

	@Then("the user get total No of Language and Verify")
	public void the_user_get_total_No_of_Language_and_Verify() throws IOException {
	    LLP.clickEnglish();
	    DriverClass.getLogger().info("UnCheched the English checkbox");
	    
	    LLP.verifyTotalLang();
	    DriverClass.getLogger().info("Successfully verified and print all the Languages");
	    
	    LLP.clickClose();
	    DriverClass.getLogger().info("Clicked the close button");
	}

	@Then("the user get total no of Levels and Verify")
	public void the_user_get_total_no_of_Levels_and_Verify() throws IOException {
	    LLP.scrollUniversity();
	    DriverClass.getLogger().info("Scrolled till University checkbox");
	    
	    LLP.verifyTotalLevel();
	    DriverClass.getLogger().info("Successfully verified and printed all Levels");
	}
}
