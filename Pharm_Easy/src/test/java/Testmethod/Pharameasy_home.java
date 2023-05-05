package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Ajio_page;
import Pageobject.Pharmaeasy_page;
import Testbase.Pharameasy_base;

public class Pharameasy_home extends Pharameasy_base {
	
	Pharmaeasy_page pharma;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pharma=new Pharmaeasy_page();
		 
	}
	
	@Test(priority=1)
	public void Logo()
	{
		boolean logo=driver.findElement(By.xpath("(//img[@alt='pharmeasy-logo'])[2]")).isDisplayed();
		//System.out.println("The logo is displayed= "+logo);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	@Test(priority=2,enabled=false)
	public void Delivery()
	{
		pharma.Pin().click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
		
	}
	
	@Test(priority=3,enabled=false)
	public void Pin_Enter() throws InterruptedException
	{
		pharma.Pin_enter().sendKeys("133301");
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
		
	}
	
	@Test(priority=4,enabled=false)
	public void Check() throws InterruptedException
	{
		pharma.Check().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	@Test(priority=5)
	public void Sign_in()
	{
		pharma.Sign_in().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=6)
	public void Mobile()
	{
		pharma.Mobile().sendKeys("9389657367");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=7)
	public void OTP() throws InterruptedException
	{
		pharma.Otp().click();
		Thread.sleep(20000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=8)
	public void Continue() throws InterruptedException
	{
		Thread.sleep(5000);
		pharma.Continue().click();
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=9,enabled=false)
	public void User()
	{
		pharma.User().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=10,enabled=false)
	public void Sign_out()
	{
		pharma.Log_out().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
}
