package stepDefinition;

import factory.DriverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePage;
import pageObjectModel.EnterprisePage;
import pageObjectModel.SecondPage;

public class EnterpriseStep {
	
	public SecondPage LLP;
	public HomePage CHP;
	public EnterprisePage FEP;
	
	@Given("the user is on the Home Page")
	public void the_user_is_on_the_home_page() {
		DriverClass.getLogger().info("****** Test Case Three Started Successfully *****");
	    LLP=new SecondPage(DriverClass.getDriver());
	    CHP=new HomePage(DriverClass.getDriver());
	    FEP=new EnterprisePage(DriverClass.getDriver());
	    DriverClass.getLogger().info("Driver is the Coursera Home Page");
	}

	@When("the user click the For Enterprise link")
	public void the_user_click_the_For_Enterprise_link() {
	    CHP.scrollToBottom();
	    DriverClass.getLogger().info("Scrolled till the bottom of the page");
	    
	    CHP.clickForEnterprise();
	    DriverClass.getLogger().info("Clicked the For Enterprise option");
	}

	@When("the user click the What we offer link")
	public void the_user_click_the_What_we_offer_link() {
	    FEP.scrollMore();
	    DriverClass.getLogger().info("Scrolled till bottom of the Page");
	    
	    FEP.clickWhatWeOffer();
	    DriverClass.getLogger().info("Successfully clicked the What We Offer option");
	}

	@When("the user click the Learn More option")
	public void the_user_click_the_Learn_More_option() {
	    FEP.scrollCampus();
	    DriverClass.getLogger().info("Scrolled till the Campus for Coursera");
	    
	    FEP.clickLearnMore();
	    DriverClass.getLogger().info("Successfully clicked the Learn More Link");
	}
	
	@When("the user set the FirstName and LastName")
	public void the_user_set_the_FirstName_and_LastName() {
	    FEP.scrollSalesTeam();
	    DriverClass.getLogger().info("Scrolled till the Sales Heading");
	    
	    FEP.setFirstName();
	    DriverClass.getLogger().info("Successfully entered the First Name");
	    
	    FEP.setLastName();
	    DriverClass.getLogger().info("Successfully entered the Last Name");
	}

	@When("the user set Email Address and Phone Number")
	public void the_user_set_email_address_and_phone_number() {
	    FEP.setEmailAddress();
	    DriverClass.getLogger().info("Successfully entered the Email Address");
	    
	    FEP.setPhoneNo();
	    DriverClass.getLogger().info("Successfully entered the Phone Number");
	}

	@When("the user select Institute Type and set Institute Name")
	public void the_user_select_institute_type_and_set_institute_name() {
	    FEP.selectInstituteType();
	    DriverClass.getLogger().info("Successfully selected the Institute Type");
	    
	    FEP.setInstituteName();
	    DriverClass.getLogger().info("Successfully entered the Institute Name");
	}

	@When("the user select Job Role and Department")
	public void the_user_select_job_role_and_department() {
	    FEP.selectJobRole();
	    DriverClass.getLogger().info("Successfully selected the Job Role");
	    
	    FEP.selectDepartment();
	    DriverClass.getLogger().info("Successfully selected the Department");
	}

	@When("the user select Describe and Expected Learning")
	public void the_user_select_describe_and_expected_learning() {
	    FEP.selectDescribe();
	    DriverClass.getLogger().info("Successfully selected the Describe");
	    
	    FEP.selectExpectedLearner();
	    DriverClass.getLogger().info("Successfully selected the Expected Learner");
	}

	@When("the user select Country and State")
	public void the_user_select_country_and_state() {
	    FEP.selectCountry();
	    DriverClass.getLogger().info("Successfully selected the Country");
	    
	    FEP.selectState();
	    DriverClass.getLogger().info("Successfully selected the State");
	}

	@Then("the user click submit and verify Email")
	public void the_user_click_submit_and_verify_Email() {
	    FEP.clickSubmit();
	    DriverClass.getLogger().info("Successfully Clicked the Submit button");
	    
	    FEP.scrollSalesTeam();
	    DriverClass.getLogger().info("Scrolled till the sales heading");
	    
	    FEP.printInvalidEmail();
	    DriverClass.getLogger().info("Successfully verified the Invalid Email message");
	    DriverClass.getLogger().info("***** Test Case Three Finished Successfully *****");
	}

}
