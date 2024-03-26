package Urbansoccertestbase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BasePage 
{
public WebDriver driver;
@BeforeClass
public void setup()
{
driver=new ChromeDriver();
driver.get("https://urbansoccermanager-stag.hestalabs.com/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().deleteAllCookies();
driver.manage().window().maximize();
}
public String randomString()
{
String generatedstring=RandomStringUtils.randomAlphabetic(5);
return generatedstring;
}
public String randomNumeric()
{
String generatedstring=RandomStringUtils.randomNumeric(10);
return generatedstring;
}
public String AlphaNumeric()
{
String str = RandomStringUtils.randomAlphabetic(3);
String nbr = RandomStringUtils.randomNumeric(3);
return(str+"@"+nbr);
}
}

