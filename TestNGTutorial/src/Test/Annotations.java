package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@AfterSuite
	public void AftSuite() {
		System.out.println("@Aftersuite runs after all codes");
	}
	 @BeforeTest
	  public void prerequisite() {
		  System.out.println("@Beforetest runs after the specific test");
	  }
	
	
	@AfterTest
	public void lastexecution() {
		System.out.println("@After test runs after the specific test");
}
	@BeforeSuite
	public void BefSuite() {
		System.out.println("@Beforesuite runs before all codes");
	}
}