package Selenium_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuroSuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	       driver.findElement(By.id("fromCity")).click();
	       WebElement source =  driver.findElement(By.xpath("//*[@placeholder='From']"));
	       source.clear();
	      source.sendKeys("mum");
	       Thread.sleep(2000L);
	       source.sendKeys(Keys.ARROW_DOWN);
	       source.sendKeys(Keys.ENTER);
	       WebElement source1 =  driver.findElement(By.xpath("//*[@placeholder='To']"));
	       source1.sendKeys("del");
	       Thread.sleep(2000L);
	       int i=1;
	       while(i<=4) {
	      source1.sendKeys(Keys.ARROW_DOWN);
	      i++; 
	      Thread.sleep(2000L);
	}
	      
	       source1.sendKeys(Keys.ENTER);
  }
}
