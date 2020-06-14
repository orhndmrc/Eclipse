package Selenium_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://book.spicejet.com/");
	       Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
	       driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).click();
	       System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
	       System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
	
}
