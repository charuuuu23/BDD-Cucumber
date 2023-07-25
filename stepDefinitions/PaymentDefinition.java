package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentDefinition {
	@Given("user already has an account on gpay")
	public void user_already_has_an_account_on_gpay() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Payment Given");
	}
	@When("user id is correct")
	public void user_id_is_correct() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Payment When");
	}
	@Then("gpay message should be sent")
	public void gpay_message_should_be_sent() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Payment Then");
		
	}
	

}
