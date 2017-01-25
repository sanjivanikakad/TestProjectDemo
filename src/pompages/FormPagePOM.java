package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPagePOM {
WebDriver driver;
By customerName=By.name("name");
By gender=By.xpath("//input[@value='f']");
By dob=By.name("dob");
By address=By.name("addr");
By city=By.name("city");
By state=By.name("state");
By pinNo=By.name("pinno");
By mobno=By.name("telephoneno");
By email=By.name("emailid");
By password=By.name("password");

public FormPagePOM(WebDriver driver)
{
	this.driver=driver;
	}
public void setName(String strName)
{
driver.findElement(customerName).sendKeys(strName);
}
	
public void clickGenderButton()
{
driver.findElement(gender).click();
}
public String setDOB(String dob1)
{
driver.findElement(dob).sendKeys(dob1);
return dob1;
}
public void setAdress(String strAdd)
{
	driver.findElement(address).sendKeys(strAdd);
	}
public void setCity(String strCity)
{
	driver.findElement(city).sendKeys(strCity);
}
public void setState(String strState)
{
	driver.findElement(state).sendKeys(strState);
	}
public void setPin(String pin)
{
	driver.findElement(pinNo).sendKeys(pin);
}
public void setMobNo(String strno)
{
driver.findElement(mobno).sendKeys(strno);
}
public void setEmail(String stremail)
{
	driver.findElement(email).sendKeys(stremail);
	}
public void setpassword(String pass)
{
	driver.findElement(password).sendKeys(pass);}
}