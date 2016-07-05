package test.java;

import main.java.Prescription;
import main.java.PrescriptionBLL;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewRxSteps extends TestCase{
	
	Prescription presc = new Prescription();
	String actionButton;
	@Given("^Patient has entered correct data$")
	public void Patient_has_entered_correct_data() throws Throwable {
	    presc.setpName("Naveen");
	    presc.setdName("ACB");
	    
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton=arg1;
	}

	@Then("^System should display \"([^\"]*)\"$")
	public void System_should_display(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		PrescriptionBLL obj = new PrescriptionBLL();
		assertEquals(arg1, obj.validate(presc));
	}

	@Given("^patient is logged In$")
	public void patient_is_logged_In() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^\"([^\"]*)\" has entered doc name \"([^\"]*)\", Date as \"([^\"]*)\", time as \"([^\"]*)\" and file name is \"([^\"]*)\"$")
	public void has_entered_doc_name_Date_as_time_as_and_file_name_is(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
