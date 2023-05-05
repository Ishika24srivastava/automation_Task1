package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Pharameasy_base;

public class Pharmaeasy_page extends  Pharameasy_base{
	
	
	@FindBy(xpath="//span[text()='Select Pincode']")
	WebElement deliver;
	
	@FindBy(xpath="//input[@placeholder='Enter PIN Code']")
	WebElement pin;
	
	@FindBy(xpath="//span[text()='Check']")
	WebElement check;
	
	@FindBy(xpath="//span[text()='Hello, Log in']")
	WebElement sign_in;
	
	@FindBy(xpath="//input[@placeholder='Enter your phone number']")
	WebElement mobile;
	
	@FindBy(xpath="//span[text()='Send OTP']")
	WebElement otp;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement  Continue;
	
	@FindBy(xpath="//a[@aria-label='login']")
	WebElement user;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//span[text()='Medicine']")
	WebElement Medicine;
	
	@FindBy(xpath="//a[text()='Healthcare']")
	WebElement Healthcare;
	
	@FindBy(xpath="//span[text()='Lab Tests']")
	WebElement LabTests;
	
	@FindBy(xpath="//a[@class='Navbar_offers__4jaMq']/span[text()='Offers']")
	WebElement Offers;
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus;
	
	@FindBy(xpath="//span[text()='Health Blogs']")
	WebElement Health_blogs;
	
	@FindBy(xpath="//input[@id='topBarInput']")
	WebElement searchbar;
	
	@FindBy(xpath="//input[@placeholder='Search medicines/Healthcare products ']")
	WebElement search_medicine;
	
	@FindBy(xpath="//h1[text()='Benadryl Cough Formula Bottle Of 150ml Syrup']")
	WebElement bendaryl150ml;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement add_cart;
	
	@FindBy(xpath="//li[@data-value='1']")
	WebElement quantity_1;
	
	@FindBy(xpath="//div[text()='Cofsils Orange Lozenges Strip Of 10']")
	WebElement Cofsils;
	
	@FindBy(xpath="//span[text()='Ginger Lemon']")
	WebElement Ginger_lemon;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement add_cart1;
	
	@FindBy(xpath="//li[@data-value='3']")
	WebElement Cofsils_3;
	
	@FindBy(xpath="//div[@id='MainBanner-1']")
	WebElement Banner1;
	
	@FindBy(xpath="//div[@id=\"MainBanner-2\"]")
	WebElement Banner2;
	
	@FindBy(xpath="//img[@alt='Health Checkups']")
	WebElement Full_bodycheckup;
	
	@FindBy(xpath="//img[@alt='Vitamins_PharmaHP']")
	WebElement Vitamins;
	
	@FindBy(xpath="//img[@alt='Diabetes Tests_PharmaHP']")
	WebElement Diabetes;
	
	@FindBy(xpath="//img[@alt='Thyroid_PharmaHP']")
	WebElement Thyroid;
	
	@FindBy(xpath="//img[@alt='Women Care_PharmaHP']")
	WebElement Women_care;
	
	@FindBy(xpath="//img[@alt='Covid Care Tests_PharmaHP']")
	WebElement covid ;
	
	@FindBy(xpath="//img[@alt='Fever Infection_PharmaHP']")
	WebElement Fever;
	
	@FindBy(xpath="//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-ikZFsNO-css']")
	WebElement Scroll;
	
	@FindBy(xpath="//span[text()='Flat 15% OFF + Rs. 300 OFF on medicine order.']")
	WebElement Offers_flatoff;
	
	@FindBy(xpath="//div[2][@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-icuuuRQ-css']")
	WebElement Paymentoffer_scroll;
	
	
	@FindBy(xpath="//button[text()='COPY CODE']")
	WebElement copy_code;
	
	@FindBy(xpath="//input[@placeholder='Search for medicines/healthcare products']")
	WebElement Search_medicine;
	
	@FindBy(xpath="//h1[text()='Crocin Advance 500mg Strip Of 20 Tablets']")
	WebElement Crocine;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement Addcart;
	
	@FindBy(xpath="//li[@data-value='3']")
	WebElement Quantity;
	
	@FindBy(xpath="//input[@id='descriptionBy']")
	WebElement Description_crocine;
	
	@FindBy(xpath="//div[@class='DescriptionTable_descriptionTable__TRPw2']")
	WebElement Product_summary;
	
	
	@FindBy(xpath="//div[text()='Saridon Headache Relief Tablet- Strip Of 10 Tablets']")
	WebElement Saridon;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement Add_saridon;
	
	@FindBy(xpath="//li[@data-value='9']")
	WebElement Quantity_saridon;
	
	@FindBy(xpath="//span[text()='View Cart']")
	WebElement view_cart;
	
	@FindBy(xpath="//div[@class='style_totalText__FF8Tn']")
	WebElement Cart_total;
	
	@FindBy(xpath="//div[@class='OffersSection_offerPromoCode__V8ecp']")
	WebElement Apply_coupons;
	
	@FindBy(xpath="(//div[text()='APPLY'])[1]")
	WebElement  Apply_coupon1;
	
	@FindBy(xpath="//div[@class=\"AmountBifurcation_container__WTNVC\"]")
	WebElement Bill_summary;
	
	@FindBy(xpath="//span[@class='AmountBifurcation_finalValue__MkWUw AmountBifurcation_finalValueBold__r8tdR']")
	WebElement Amount;
	
	
	
	public Pharmaeasy_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Pin()
	{
		return deliver;
	}
	public WebElement Pin_enter()
	{
		return pin;
	}
	public WebElement Check()
	{
		return check;
	}
	public WebElement Sign_in()
	{
		return sign_in;
	}
	public WebElement Mobile()
	{
		return mobile;
	}
	public WebElement Otp()
	{
		return otp;
	}
	
	public WebElement Continue()
	{
		return Continue;
	}
	public WebElement User()
	{
		return user;
	}
	public WebElement Log_out()
	{
		return Logout;
	}
	
	public WebElement Medicine()
	{
		return Medicine;
	}
	
	public WebElement Healthecare()
	{
		return Healthcare;
	}
	
	public WebElement LabTests()
	{
		return LabTests;
	}
	
	public WebElement Offers()
	{
		return Offers;
	}
	
	public WebElement Plus()
	{
		return Plus;
	}
	
	public WebElement HealthBlogs()
	{
		return Health_blogs;
	}
	
	public WebElement Search_bar()
	{
		return searchbar;
	}
	public WebElement Search_medicine()
	{
		return search_medicine;
	}
	public WebElement Bendaryl()
	{
		return bendaryl150ml;
	}
	public WebElement Add_cart()
	{
		return add_cart;
	}
	public WebElement Quantity()
	{
		return quantity_1;
	}
	public WebElement Cofsils()
	{
		return Cofsils;
	}
	public WebElement Flavour()
	{
		return Ginger_lemon;
	}
	public WebElement Cart_Cofsils()
	{
		return add_cart1;
	}
	public WebElement Amount()
	{
		return Amount;
	}
	public WebElement Quantity_Cofsils()
	{
		return  Cofsils_3;
	}
	public WebElement Main_banner1()
	{
		return  Banner1;
	}
	public WebElement Main_banner2()
	{
		return  Banner2;
	}
	public WebElement Full_body()
	{
		return  Full_bodycheckup;
	}
	public WebElement Vitamins()
	{
		return  Vitamins;
	}
	public WebElement Diabetes()
	{
		return  Diabetes;
	}
	public WebElement Thyroid()
	{
		return  Thyroid;
	}
	public WebElement Women_care()
	{
		return  Women_care;
	}
	public WebElement Covid_care()
	{
		return  covid;
	}
	public WebElement Fever()
	{
		return  Fever;
	}
	public WebElement Scroll_more()
	{
		return  Scroll;
	}
	public WebElement Offer()
	{
		return  Offers_flatoff;
	}
	public WebElement Payment_offer()
	{
		return  Paymentoffer_scroll;
	}
	
	public WebElement Copy_code()
	{
		return  copy_code;
	}
	
	public WebElement Search_Medicine()
	{
		return  Search_medicine;
	}
	public WebElement Crocin()
	{
		return  Crocine;
	}
	public WebElement Bill_summary()
	{
		return  Bill_summary;
	}
	public WebElement Add_Crocine()
	{
		return  Addcart;
	}
	public WebElement Quantity_crocine()
	{
		return  Quantity;
	}
	public WebElement Crocine_decription()
	{
		return  Description_crocine;
	}
	public WebElement Product_summary()
	{
		return  Product_summary;
	}
	public WebElement Saridon()
	{
		return Saridon;
	}
	public WebElement Add_saridon()
	{
		return Add_saridon;
	}
	public WebElement Quantity_saridon()
	{
		return Quantity_saridon;
	}
	public WebElement View_cart()
	{
		return view_cart;
	}
	public WebElement Cart_total()
	{
		return Cart_total;
	}
	public WebElement Apply_coupons()
	{
		return Apply_coupons;
	}
	
	public WebElement Apply_coupon1()
	{
		return Apply_coupon1;
	}
	

}
