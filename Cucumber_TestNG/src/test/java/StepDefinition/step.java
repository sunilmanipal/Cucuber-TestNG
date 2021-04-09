package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class step {
	
	@Given("Login application should be present")
	public void login_application_should_be_present() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("it is working");
	}
	
	@When("Enter Name {string}")
	public void enter_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(string);
	}
	@When("Enter pwd {string}")
	public void enter_pwd(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}

}
