package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
//		WebDriverWait wait = new 	WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Multiple Windows')]")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		System.out.println(driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		//Capturing the windows
		String parentWindow = it.next();
		String childWindow = it.next();
		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			
//		}
//	       for(String n :windows) {
//	    	   System.out.println(n);
//	       }
		
		System.out.println("Parent window : "+parentWindow);
		System.out.println("Child window : "+childWindow);
		
		//switching to child window
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		System.out.println("Text captured = "+driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		System.out.println("Text captured = "+driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		

	}

}
