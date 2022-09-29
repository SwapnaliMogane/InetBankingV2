package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

	
		@FindBy(name="uid")
		WebElement txtUsername;
		
		@FindBy(name="password")
		WebElement txtPassword;
		
		@FindBy(name="btnLogin")
		WebElement btnLogin;
		
		@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
		WebElement lnkLogout;
		
		public void setUsername(String uname)//getting username from actual test case
		{
			txtUsername.sendKeys(uname);
		}
		
		public void setPassword(String pwd)//getting password from actual test case
		{
			txtPassword.sendKeys(pwd);
		}
		
		public void clickSubmit()
		{
			btnLogin.click();
		}

		public void clickLogout() {
			lnkLogout.click();
			
		}
		
		
}
