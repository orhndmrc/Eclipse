package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class day3 extends Annotations{
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("@Beforemethod runs before  method");
	}
	
	@Test
	public void WebloginCarLoan(String urlname) {
		//selenium code
		System.out.println("weblogincar");
		System.out.println(urlname);
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("@Aftermethod runs after  method");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan() {
		//Appium
		System.out.println("mobilelogincar");
	}

	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void APIsignincarLoan() {
		//Rest API Automation 
		System.out.println("Apilogincar");
	}
}
