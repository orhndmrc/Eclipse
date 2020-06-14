package Selenium_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\eclipse\\chromedriver.exe");
			       WebDriver driver = new ChromeDriver();
			       driver.get("https://book.spicejet.com/");
			       driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
			       Thread.sleep(2000L);
			       driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
			       driver.findElement(By.xpath("//*[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@text='Chennai (MAA)']")).click();
	
	}

}
