package Urbansoccertestbase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BasePage 
{
public WebDriver driver;
public Logger logger;
public Properties p;
@BeforeClass
@Parameters({"os","browser"})
public void setup(String os, String br) throws IOException
{
//loading the Properties files
FileReader file = new FileReader(".//src/test/resources/config.properties");
p=new Properties();
p.load(file);
//Loading log4j2file
logger = LogManager.getLogger(this.getClass());
//lauching browser based on the condition
switch(br.toLowerCase())
{
case "chrome":driver=new ChromeDriver();break;
case "safari":driver=new SafariDriver();break;
default: System.out.println("No matching browser....");
return;
}
driver.get(p.getProperty("appURL"));
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

