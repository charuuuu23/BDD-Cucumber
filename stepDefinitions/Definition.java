package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition {
	@Given("User is on the login screen")
	public void user_is_on_the_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("**GIVEN**");
	}
	
	@When("user provides correct username")
	public void user_provides_correct_username(DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
//System.out.println("** WHEN PART1**"+u);
		List<String> table=data.asList();
		System.out.println(table.get(0));
		
		System.out.println("System is working");}
	@When("user provides correct password={string}")
	public void user_provides_correct_password(String p) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("** WHEN PART2**"+p);	}
	@Then("User must login")
	public void user_must_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("**THEN PART1**");
	}
	    @Then("error should not be there")
		public void error_should_not_be_there() {
		    // Write code here that turns the phrase above into concrete actions
	    	int num=10/0;
		    System.out.println("**THEN PART2**");

	}
	
	
	}




