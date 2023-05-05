package Testmethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobject.Pharmaeasy_page;
import Testbase.Pharameasy_base;

public class PharmEasy_Cartpage extends Pharameasy_base {
	
	Pharmaeasy_page pharmcart;
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pharmcart=new Pharmaeasy_page();
		 
	}
	
	
	
	
	@Test(priority=6)
	public void Search_button() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[text()='Search'])[2]")).click();
		Thread.sleep(500);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#searchPopoverOpened");
	}
	
	
	@Test(priority=7)
	public void Search_medicine() throws InterruptedException
	{
		
		pharmcart.Search_Medicine().sendKeys("Crocine");
		Thread.sleep(2000);
		pharmcart.Search_Medicine().sendKeys(Keys.ENTER);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/search/all?name=Crocine");
	}
	
	@Test(priority=8)
	public void Crocine() throws InterruptedException
	{
		pharmcart.Crocin().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
		
	}
	
	@Test(priority=9)
	public void Add_crocine() throws InterruptedException
	{
		pharmcart.Add_Crocine().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
	}
	
	@Test(priority=10)
	public void Quantity_crocine() throws InterruptedException
	{
		pharmcart.Quantity_crocine().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
	}
	
	
	
	@Test(priority=11)
	public void Description() throws InterruptedException
	{
		String text=pharmcart.Crocine_decription().getText();
		System.out.println("The text = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/crocin-advance-500mg-strip-of-20-tablets-493507");
	}
	
	@Test(priority=12)
	public void  Summary_Crocine() throws InterruptedException
	{
		String Product_summary=pharmcart.Product_summary().getText();
		System.out.println("The Product summary  = "+Product_summary);
		Thread.sleep(2000);
		String url=driver.getTitle();
		Assert.assertEquals(url,"Crocin Advance 500 MG Tablet (20): Uses, Side Effects, Price & Dosage | PharmEasy");
		
	}
	
	@Test(priority=13)
	public void Saridon_product2() throws InterruptedException
	{
		pharmcart.Saridon().click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy SARIDON HEADACHE RELIEF TABLET- STRIP OF 10 TABLETS Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=14)
	public void AddSaridon_product2() throws InterruptedException
	{
		pharmcart.Add_saridon().click();;
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy SARIDON HEADACHE RELIEF TABLET- STRIP OF 10 TABLETS Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=15)
	public void QunatitySaridon_product2() throws InterruptedException
	{
		pharmcart.Quantity_saridon().click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		Assert.assertEquals(titile,"Buy SARIDON HEADACHE RELIEF TABLET- STRIP OF 10 TABLETS Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=16)
	public void View_Cart() throws InterruptedException
	{
		pharmcart.View_cart().click();
		Thread.sleep(1000);
		String titile=driver.getTitle();
		System.out.println("view= "+titile);
		Assert.assertEquals(titile,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=17)
	public void Details_Crocin()
	{
		String details=driver.findElement(By.xpath("//a[1][@class='styles_productContainer__WKZ31 ']")).getText();
		System.out.println("The deatils of Crocin = "+details);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=18)
	public void Details_Saridon()
	{
		String details=driver.findElement(By.xpath("//a[2][@class='styles_productContainer__WKZ31 ']")).getText();
		System.out.println("The deatils of Saridon  = "+details);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=19)
	public void Cart_Total()
	{
		String carttotal=pharmcart.Cart_total().getText();
		System.out.println("The cart total amount = "+carttotal);
		String cart_total=driver.findElement(By.xpath("//div[@class='style_totalText__FF8Tn']")).getText();
		Assert.assertEquals(carttotal,cart_total);
	}
	
	@Test(priority=20)
	public void  Apply_Coupons()
	{
		pharmcart.Apply_coupons().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=21)
	public void  Apply_Coupons1()
	{
		pharmcart.Apply_coupon1().click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=22)
	public void Bill_summary()
	{
		String bill_summary=pharmcart.Bill_summary().getText();
		System.out.println("The bill summary = "+bill_summary);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Order Medicines Online - Cart - PharmEasy");
	}
	
	@Test(priority=23)
	public void Amount_Paid()
	{
		String Amount=pharmcart.Amount().getText();
		System.out.println("The amount to be paid = "+Amount);
		Assert.assertEquals(Amount,driver.findElement(By.xpath("//span[@class='AmountBifurcation_finalValue__MkWUw AmountBifurcation_finalValueBold__r8tdR']")).getText());
	}
	
	

}
