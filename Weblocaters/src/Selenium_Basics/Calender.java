package Selenium_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.spicejet.com/");
	       driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
	       Thread.sleep(500L);
	       driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0' or @value=OneWay]")).click();
	}

}
