package cgi.hyd;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcSteps extends TestCase{
	private WebDriver driver;
	private String baseUrl;
	@Given("^user enter (\\d+) in first inpit and (\\d+) in second input$")
	public void user_enter_in_first_inpit_and_in_second_input(int fValue, int sValue) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver = new FirefoxDriver();
	    baseUrl = "http://ata123456789123456789.appspot.com/";
	    driver.get(baseUrl);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("ID_nameField1")).sendKeys(fValue+"");
	    driver.findElement(By.id("ID_nameField2")).sendKeys(sValue+"");
	    
	}

	@When("^select \"([^\"]*)\"$")
	public void select(String opt) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(opt.equals("Mul"))
		{
			driver.findElement(By.id("gwt-uid-2")).click();

		}
	}

	@When("^click on Calculate$")
	public void click_on_Calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int expectedResult) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(expectedResult+"", result);
	}


}
