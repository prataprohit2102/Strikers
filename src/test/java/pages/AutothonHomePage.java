package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutothonHomePage  {
	Wait wait;

	public AutothonHomePage(WebDriver driver) throws Exception {
		 wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is used for click on Login Link.
	 */
	public void clickLoginLink(){
		
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
		LoginLink.click();
	}
	
	/**
	 * This method is used to verify  credentials panel display.
	 * @return
	 */
	public boolean isVisibleCredentialsPanel(){
		boolean flag = false;
		wait.until(ExpectedConditions.visibilityOf(CredentialsPanel));
		if(CredentialsPanel.isDisplayed()){
			flag=true;
		}
		return flag;
	}
	
	

	
	
//	public void enterPasswordAdminFieldData(String strPasswordAdmin){
//		wait.until(ExpectedConditions.visibilityOf(PassWordAdmin));
//		PassWordAdmin.sendKeys(strPasswordAdmin);
//	}
	
	/**
	 * This method is used to click login button.
	 */
	public void clickLoginButton(){
		wait.until(ExpectedConditions.visibilityOf(ButtonLogin));
		ButtonLogin.click();
	}
	
	/**
	 * This method is used for Admin menu display verification.
	 * @return
	 */
	public boolean isPresentAdminMenu(){
		boolean flag=false;
		wait.until(ExpectedConditions.visibilityOf(EleAdminMenu));
		if(EleAdminMenu.isDisplayed()){
			flag=true;
		}
		return flag;
	}
	

	
	
//Autothon elements
 @FindBy(xpath ="//a[text()='Login']")
 WebElement LoginLink;
 @FindBy(xpath = "//div[@id='main']/descendant::div[@class='collapse show'][2]")
 public WebElement CredentialsPanel;
 @FindBy(xpath = "//input[@name='password']")
 WebElement UserNameAdmin;
 @FindBy(xpath = "//input[@name='username']")
 WebElement PassWordAdmin;
 @FindBy(xpath = "//button[text()='Login']")
 WebElement ButtonLogin;
 @FindBy(xpath = "//span[text()='Admin Menu']")
 WebElement EleAdminMenu;
 @FindBy(xpath = "//a[text()='add movie']")
 WebElement EleAddMovieLink;

 @FindBy(xpath = "//input[@name='title']")
 WebElement EleTitle;

//public void enterUserNameAdminFieldData(String arg1, String arg2) {
//	wait.until(ExpectedConditions.visibilityOf(UserNameAdmin));
//	UserNameAdmin.sendKeys(strUserNameAdmin);
//	PassWordAdmin.sendKeys(strPasswordAdmin);
//	
//}

public void enterUserNameAdminFieldData(String arg1, String arg2) {
	wait.until(ExpectedConditions.visibilityOf(UserNameAdmin));
	UserNameAdmin.sendKeys(arg1);
	PassWordAdmin.sendKeys(arg2);
}

/**
 * This method is used to click Add movie link.
 */
public void clickAddMovieLink(){
	wait.until(ExpectedConditions.visibilityOf(EleAddMovieLink));
	EleAddMovieLink.click();
}

/**
 * This method is used to enter movie title field.
 * @param strMovietitle
 */
public void enterTitleField(String strMovietitle,String arg2,String arg3,String arg4,String arg5){
	wait.until(ExpectedConditions.visibilityOf(EleTitle));
	EleTitle.sendKeys(strMovietitle);
	EleTitle.sendKeys(arg2);
	EleTitle.sendKeys(arg3);
	EleTitle.sendKeys(arg4);
	EleTitle.sendKeys(arg5);
	
}


}