package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Ajio_page;
import Testbase.Aji_base;

public class Sign_in extends Aji_base {
	Ajio_page ag;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 ag=new Ajio_page();
		 
	}
	
	@Test(priority=1)
	public void Sign() throws InterruptedException
	{
		ag.Sign().click();
		Thread.sleep(1000);
		ag.Mobile().sendKeys("8533904286");
		Thread.sleep(1000);
		ag.Con().click();
		Thread.sleep(9000);
		//ag.Otp().sendKeys("1050");
		Thread.sleep(2000);
		ag.Start().click();
		Thread.sleep(1000);
		System.out.println("Sign in successfully");
		String ss=driver.getCurrentUrl();
		System.out.println("The current url= "+ss);
		Assert.assertEquals(ss, "https://www.ajio.com/");
	}
	
	@Test(priority=2)
	public void delivered() throws InterruptedException
	{
		ag.Cusomer().click();
		Thread.sleep(1000);
		ag.Deli().click();
		Thread.sleep(1000);
		ag.Tt().click();
		Thread.sleep(1000);
		ag.ss().click();
		Thread.sleep(200);
		String s=ag.text().getText();
		System.out.println("the price will be= "+s);
		ag.Save().click();
		Thread.sleep(1000);
		boolean status=driver.findElement(By.xpath("//div[@class='logo-float undefined']")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	@Test(priority=3)
	public void select() throws InterruptedException
	{
		ag.Top().click();
		Thread.sleep(1000);
		
		
		String title=driver.getTitle();
		System.out.println("The title= "+title);
		boolean status=driver.findElement(By.xpath("//div[@class='logo-float undefined']")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	@Test(priority=4)
	public void Select_item() throws InterruptedException
	{
		ag.Size().click();
		Thread.sleep(1000);
		boolean status=driver.findElement(By.xpath("//div[@class='logo-float undefined']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=5)
	public void Move() throws InterruptedException
	{
		ag.Add().click();
		Thread.sleep(1000);
		String s=ag.Details().getText();
		System.out.println("The details of the item selected = "+s);
		boolean status=driver.findElement(By.xpath("//div[@class='logo-float undefined']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=4,enabled=false)
	public void Select1() throws InterruptedException
	{
		ag.top1().click();
		Thread.sleep(1000);
		ag.size1().click();
		Thread.sleep(1000);
		ag.Add1().click();
		Thread.sleep(1000);
		
		String title=driver.getCurrentUrl();
		System.out.println("The current title = "+title);
		boolean status=driver.findElement(By.xpath("//div[@class='logo-float undefined']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=6)
	public void display() throws InterruptedException {
		ag.CartView().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("The current url = "+url);
		Assert.assertEquals(url,"https://www.ajio.com/cart");
	}
	
	@Test(priority=7)
	public void Order() throws InterruptedException {
		
		//String price=ag.cartOrder().getText();
		String w1=driver.findElement(By.xpath("//span[@class='price-value']")).getText();
		System.out.println("The bag total= "+w1);
		Thread.sleep(2000);
		Assert.assertEquals(w1,driver.findElement(By.xpath("//span[@class='price-value']")).getText());
		String title=driver.getTitle();
		System.out.println("The current title= "+title);
		
	}
	
	@Test(priority=8)
	public void  discount() throws InterruptedException {
		String w2=driver.findElement(By.xpath("//span[@class='price-value discount-price']")).getText();
		System.out.println("The bag discount= "+w2);
		Thread.sleep(1000);
		Assert.assertEquals(w2,driver.findElement(By.xpath("//span[@class='price-value discount-price']")).getText());
		
	}
	
	@Test(priority=9)
	public void Total() throws InterruptedException 
	{
		String w3=driver.findElement(By.xpath("//section/span[@class='price-value bold-font']")).getText();
		System.out.println("The total price=  "+w3);
		Thread.sleep(1000);
		Assert.assertEquals(w3,driver.findElement(By.xpath("//section/span[@class='price-value bold-font']")).getText());
	}
	
	@Test(priority=10)
	public void Procced() throws InterruptedException
	{
		ag.Procced().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("The current title=  "+title);
	}
	
	@Test(priority=11)
	public void Delivered() throws InterruptedException
	{
		String s=driver.findElement(By.xpath("//div[text()='Delivery Address']")).getText();
		System.out.println("The text = "+s);
		Thread.sleep(500);
		Assert.assertEquals(s,driver.findElement(By.xpath("//div[text()='Delivery Address']")).getText());
	}
	
	@Test(priority=12)
	public void Address() throws InterruptedException
	{
		String s=driver.findElement(By.xpath("//div[@class='address-info']")).getText();
		System.out.println("The address= "+s);
		Thread.sleep(1000);
		Assert.assertEquals(s,driver.findElement(By.xpath("//div[@class='address-info']")).getText());
	}
	
	@Test(priority=13,enabled=false)
	public void Delivery_date() throws InterruptedException
	{
		String deliverdate=driver.findElement(By.xpath("//div[@class='est-date']")).getText();
		System.out.println("The delivery date= "+deliverdate);
		Thread.sleep(500);
		Assert.assertEquals(deliverdate, driver.findElement(By.xpath("//div[@class='est-date']")).getText());
	}

	@Test(priority=14)
	public void Sign_out() throws InterruptedException
	{
		ag.SignOut().click();
		Thread.sleep(1000);
		System.out.println("Sign out successfully");
		String s=driver.getCurrentUrl();
		System.out.println("The url after logging out= "+s);
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
