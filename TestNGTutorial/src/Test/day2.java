package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 extends Annotations {
  @Test(groups= {"Smoke"})
public void ploan() {
	System.out.println("good");
}
 @BeforeMethod
 public void bfMethod() {
	 System.out.println("*************************");
 }
}
