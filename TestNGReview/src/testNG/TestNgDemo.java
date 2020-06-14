package testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver;
	String url;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\demir\\eclipse\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		 url = "https://opensource-demo.orangehrmlive.com/";
		 driver.get(url);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
   @Test
   public void titleValidation() {
	String expectedTitle ="OrangeHRM";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle,"Title miscmatch");
}
   @Test
   public void login() {
	   //enter username and password
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.xpath(" //input[@name='txtPassword']")).sendKeys("admin123");
	   
	   //click login button
	   driver.findElement(By.cssSelector(".button")).click();
	   
	   WebElement logo = driver.findElement(By.xpath("//div[@id='branding']//a//img"));
	   Assert.assertTrue(logo.isDisplayed(),"Login Fail");
	
   }
}
