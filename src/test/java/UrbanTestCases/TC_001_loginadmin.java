package UrbanTestCases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import UrbanSoccerPageObject.Adminsigin;

import org.testng.annotations.Test;

import Urbansoccertestbase.BasePage;

public class TC_001_loginadmin extends BasePage
{
@Test
public void sigin() throws InterruptedException
{
logger.info("***Starting of the testcase***");
try
{
Adminsigin ad = new Adminsigin(driver);
logger.info("Entering valid email and password");
ad.efield(p.getProperty("email"));
logger.info("Clicked on the account admin email");
ad.pwdfield(p.getProperty("password"));
logger.info("Clicked on the account admin password");
ad.loginfield();
logger.info("Clicked on the account admin");
Thread.sleep(5000);
ad.createlogin();
logger.info("Clicked on the creategame");
ad.Stringgamename(randomString().toLowerCase());
Thread.sleep(10000);
ad.ground();
logger.info("Clicked on the ground");
ad.teamhome();
logger.info("Clicked on the hometeam");
//Thread.sleep(5000);
ad.teamaway();
logger.info("Clicked on the teamaway");
ad.controller();
logger.info("Clicked on the controller");
ad.breaktime();
logger.info("Clicked on the breaktime");
Thread.sleep(5000);
ad.submitbutton();
logger.info("Clicked on the submitbutton");
ad.signout();
logger.info("Clicked on the logoutbutton");
}
catch(Exception e)
{
logger.error("test failed...");	
Assert.fail();
}
}
}


