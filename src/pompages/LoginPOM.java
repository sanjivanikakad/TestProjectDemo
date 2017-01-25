package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	 
	    WebDriver driver;
	    By username=By.name("uid");
	    By password=By.name("password");
	    By login=By.name("btnLogin");
	    By titleText =By.className("barone");

	    public LoginPOM(WebDriver driver){

	        this.driver = driver;

	    }
	    public LoginPOM setUserName(String strUserName){
	    	driver.findElement(username).clear();
	        driver.findElement(username).sendKeys(strUserName);
	        return this;

	    }
	    public LoginPOM setPassword(String strPassword){
	    	driver.findElement(username).clear();
	         driver.findElement(password).sendKeys(strPassword);
	         return this;
	    }
	    public LoginPOM clickLoginButton(){

	            driver.findElement(login).click();
	            return this;

	    }
	    public String getLoginTitle(){

	     return    driver.findElement(titleText).getText();

}

	    public void login(String strUserName,String strPasword){

	       this.setUserName(strUserName);
	       this.setPassword(strPasword);
	       this.clickLoginButton();        

	        

	    }
}
