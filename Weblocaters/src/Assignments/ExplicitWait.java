package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'load get data')]")).click();
		WebDriverWait w = new WebDriverWait(driver,7);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
	}

}
