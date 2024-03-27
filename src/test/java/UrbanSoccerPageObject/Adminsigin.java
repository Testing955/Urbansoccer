package UrbanSoccerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminsigin extends BaseClass
{
WebDriver driver;
public Adminsigin(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtemailfield;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement txtpasswordfield;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div[1]/div/form/div[4]/div[1]/button")
WebElement btnlogin;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[1]/div/div/div/a")
WebElement btncreate;
@FindBy(name="game_name")
WebElement txtgamename;
@FindBy(xpath="//option[normalize-space()='Street Soccer Park']")
WebElement txtground;
@FindBy(xpath="//option[normalize-space()='Caring Soccer Club']")
WebElement txtHomeTeam;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/form/div[3]/div[2]/select")
WebElement txtAwayTeam;
@FindBy(xpath="//option[normalize-space()='Select the Controller of the Game']")
WebElement txtcontroller;
@FindBy(xpath="//option[normalize-space()='2m Halftime']")
WebElement txtGameBreakTime;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/form/div[5]/button")
WebElement Submit;
@FindBy(xpath="//a[@id='logout_btn']")
WebElement btnlogout;

public void efield(String email)
{
txtemailfield.sendKeys(email);
}
public void pwdfield(String passwords)
{
txtpasswordfield.sendKeys(passwords);
}
public void loginfield()
{
btnlogin.click();
}
public void createlogin()
{
btncreate.click();	
}
public void Stringgamename(String gname)
{
txtgamename.sendKeys(gname);
}
public void ground()
{
txtground.click();
}
public void teamhome()
{
txtHomeTeam.click();
}
public void teamaway()
{
txtAwayTeam.sendKeys("Honesty Soccer Club");;
}
public void controller()
{
txtcontroller.click();
}
public void breaktime()
{
txtGameBreakTime.click();
}
public void submitbutton()
{
Submit.click();
}
public void signout()
{
btnlogout.click();
}
}



