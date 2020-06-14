package Selenium_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Messages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Orhan";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       driver.findElement(By.cssSelector("input#name")).sendKeys(text);
	       Thread.sleep(2000L);
	       driver.findElement(By.id("alertbtn")).click();
	       System.out.println(driver.switchTo().alert().getText());
	       Thread.sleep(2000L);
	         driver.switchTo().alert().accept();
	         driver.findElement(By.id("confirmbtn")).click();
	         Thread.sleep(2000L);
	         System.out.println(driver.switchTo().alert().getText());
	         driver.switchTo().alert().dismiss();
	}

}
