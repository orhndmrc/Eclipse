package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.cleartrip.com");
	       driver.manage().window().maximize();
	       Select s = new Select(driver.findElement(By.id("Adults")));
	       s.selectByVisibleText("6");
	       Thread.sleep(2000L);
	       driver.findElement(By.xpath("//input[contains(@class,'depart_date')]")).click();
	       driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
	       Thread.sleep(2000L);
	       driver.findElement(By.cssSelector("a[title*='More ']")).click();
	       Thread.sleep(2000L);
	       Select k = new Select(driver.findElement(By.id("Class")));
	       k.selectByValue("Business");
	       driver.findElement(By.cssSelector("input#AirlineAutocomplete")).sendKeys("indigo");
	       Thread.sleep(2000L);
	       driver.findElement(By.cssSelector(".booking.large")).click();
	       System.out.println(driver.findElement(By.cssSelector("form[id='SearchForm']>div[class^='line']")).getText());
	       
	    
	       
	}

}
