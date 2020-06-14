package Test;

import org.testng.annotations.Test;

public class day4 extends Annotations {
	@Test
	public void WebloginHomeLoan() {
		//selenium code
		System.out.println("webloginhome");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan() {
		//Appium
		System.out.println("mobileloginhome");
	}
	@Test
	public void LoginAPICarloan() {
		//Rest API Automation 
		System.out.println("Apiloginhome");
	}
}
