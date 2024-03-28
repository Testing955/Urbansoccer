package UrbanTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import UrbanSoccerPageObject.Adminsigin;
import Urbansoccertestbase.BasePage;
import Utilities.DataProviders;

public class TC_002_DDT extends BasePage
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)	
public void verify_loginDDT(String email, String password,String exp) throws InterruptedException
{
logger.info("***Starting of the TC_002_DDT***");
try
{
Adminsigin ad = new Adminsigin(driver);
ad.efield(email);
ad.pwdfield(password);
ad.loginfield();
Thread.sleep(5000);
ad.createlogin();
Thread.sleep(5000);
ad.Stringgamename(randomString().toLowerCase());
Thread.sleep(10000);
ad.ground();
ad.teamhome();
//Thread.sleep(5000);
ad.teamaway();
ad.controller();
ad.breaktime();
Thread.sleep(5000);
ad.submitbutton();
Thread.sleep(5000);
ad.signout();
if(exp.equalsIgnoreCase("Valid"))
{
Assert.assertTrue(true);
}
else
{
Assert.assertFalse(false);
}
if(exp.equalsIgnoreCase("Invalid"))
{
Assert.assertTrue(false);
}
else
{
Assert.assertTrue(true);
}
}
catch(Exception e )
{
Assert.fail();
}
logger.info("***Finish of the TC_002_DDT***");
}
}
