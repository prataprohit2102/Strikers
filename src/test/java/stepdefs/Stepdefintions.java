package stepdefs;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefintions {


	@Given("^User loads the homepage url$")
	public void user_loads_the_homepage_url() {
	   
	}
	
	@When("^User loads the url in browser$")
	public void load_url_in_browser() {
		String propertyFilePath="project.properties";
		String driverPath;
//		public static final String BaseDirPath=System.getProperty("user.dir")+"/Users/sonamsharma/workspace/Exercise/src/test/java/features";
		
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(propertyFilePath));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			};
			
			 
			 Properties properties = new Properties();
			
			 try {
				properties.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			 driverPath = properties.getProperty("DriverPath");
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
	}

	@Then("^User should be able to see login page$")
	public void user_should_be_able_to_see_login_page() {
	    
	}

	@When("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_password_as(String arg1, String arg2) {
	 
	}
	@When("^User comes on homepage$")
	public void user_comes_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("^User should see Home Page Header text \"([^\"]*)\"$")
	public void user_should_see_Home_Page_Header_text(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	}

	@Then("^User clicks \"([^\"]*)\" Link$")
	public void user_clicks_Link(String arg1) {
	    System.out.println(arg1);
	   
	}

	@Then("^User should be able to see \"([^\"]*)\"$")
	public void user_should_be_able_to_see(String arg1) {
	   System.out.println(arg1);
	}

	@Then("^User enters First name as \"([^\"]*)\" Last name as \"([^\"]*)\" Email as \"([^\"]*)\" Contact number as \"([^\"]*)\" Password as \"([^\"]*)\" Confirm Password as \"([^\"]*)\"$")
	public void user_enters_First_name_as_Last_name_as_Email_as_Contact_number_as_Password_as_Confirm_Password_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
	System.out.println(arg1);
	}

}
