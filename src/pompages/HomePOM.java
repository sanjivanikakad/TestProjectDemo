package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePOM {
WebDriver driver;
By homePageUserName = By.xpath("//table//tr[@class='heading3']");
By homepagemenuName=By.xpath("//*[contains(text(), 'New Customer')]");


public HomePOM(WebDriver driver)
{

    this.driver = driver;

}
    public String getHomePageDashboardUserName(){

     return    driver.findElement(homePageUserName).getText();
   

    }
    public void clickbutton()
    {
    	driver.findElement(homepagemenuName).click();
    }

}
