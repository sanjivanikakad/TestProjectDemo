package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pompages.FormPagePOM;
import pompages.HomePOM;
import pompages.LoginPOM;


public class PomTest {
	WebDriver driver;
	LoginPOM objlogin;
	HomePOM objhome;
	FormPagePOM objform;
	
	@BeforeSuite
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");

	}
	
	@Test(priority=1)
	public void testloginpage(){
System.out.println("");
		objlogin = new LoginPOM(driver);
		String loginPageTitle = objlogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		objlogin
		.setPassword("password")
		.setUserName("username");
		
		//objlogin.login("mngr64098", "nazazut");

	}
	
	@Test(priority=2)
	public void testHomePage()
	{
		objhome=new HomePOM(driver);
		Assert.assertTrue(objhome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr64098"));
		objhome.clickbutton();
	}
	
	@Test(priority=3)
	public void testForm() throws InterruptedException 
	{
		objform=new FormPagePOM(driver);
		objform.setName("Sanjivani");
		objform.clickGenderButton();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objform.setDOB("02/07/1992");
		Thread.sleep(2000);
		objform.setAdress("karvenager\n pune");
		objform.setCity("pune");
		Thread.sleep(2000);
		objform.setState("Maharashtra");
		objform.setPin("444102");
		Thread.sleep(2000);
		objform.setMobNo("9657639512");
		objform.setEmail("Sanjivanikakad@gmail.com");
		objform.setpassword("sanju");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
}
