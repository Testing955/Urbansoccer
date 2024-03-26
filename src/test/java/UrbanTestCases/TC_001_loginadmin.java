package UrbanTestCases;

import org.testng.annotations.Test;

import Urbansoccer.Adminsigin;
import Urbansoccertestbase.BasePage;

public class TC_001_loginadmin extends BasePage
{
@Test
public void sigin() throws InterruptedException
{
Adminsigin ad = new Adminsigin(driver);
ad.efield();
ad.pwdfield();
ad.loginfield();
Thread.sleep(5000);
ad.createlogin();
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
}
}


