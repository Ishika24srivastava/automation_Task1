
package Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pharameasy_base {
	public static WebDriver driver;
	public static Properties prop;
	

	public   void intilization() throws InterruptedException 
	{
		try {
				FileInputStream fs=new FileInputStream("C:\\Users\\isrivastava\\eclipse-workspace\\Project1\\src\\test\\java\\Testbase\\Pharamaeasy.properties");
				prop=new Properties();
				prop.load(fs);
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
				Thread.sleep(1000);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not available");
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
		public static  void terminate()
		{
			driver.quit();
		}
		


}
