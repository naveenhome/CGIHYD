package cgi.hyd;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Cgi {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  @Test
  public void testCgi() throws Exception {
	  driver = new FirefoxDriver();
	    baseUrl = "https://www.google.co.in/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  driver.get(baseUrl + "/?gfe_rd=cr&ei=u117V7JIx4vxB96opbAJ&gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("naveen kumar singh scrum");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("cgi bangalore");
  }

}
