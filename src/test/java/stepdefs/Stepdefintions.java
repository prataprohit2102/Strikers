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
import pages.AutothonHomePage;

public class Stepdefintions {
	WebDriver driver;
	 String URL;
	 AutothonHomePage autothon;
	Stepdefintions() throws Exception{
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
			  URL=properties.getProperty("url");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		 autothon=new AutothonHomePage(driver);
	}
	@Given("^User loads the homepage url$")
	public void user_loads_the_homepage_url() {
	   
	}
	
	@When("^User loads the url in browser$")
	public void load_url_in_browser() {
	
		driver.get(URL);
		
	}

	@When("^User clicks on login link$")
	public void user_clicks_on_login_link() {
		autothon.clickLoginLink();
		autothon.isVisibleCredentialsPanel();
	}

	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String arg1, String arg2) {
	    autothon.enterUserNameAdminFieldData(arg1, arg2);
	}

	@When("^Clicks login$")
	public void clicks_login() {
	    autothon.clickLoginButton();
	}

	@Then("^User should be able to see add new movie link$")
	public void user_should_be_able_to_see_add_new_movie_link() {
		autothon.isPresentAdminMenu();
		autothon.clickAddMovieLink();
	}


	@Then("^User enters the title as \"([^\"]*)\" director as \"([^\"]*)\" description as \"([^\"]*)\" catogories as \"([^\"]*)\" url as \"([^\"]*)\" rating as \"([^\"]*)\"$")
	public void user_enters_the_title_as_director_as_description_as_catogories_as_url_as_rating_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
	    autothon.enterTitleField(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^clicks save$")
	public void clicks_save() {
	   
	}

	@Then("^movie details should be saved$")
	public void movie_details_should_be_saved() {
	    
	}

}
