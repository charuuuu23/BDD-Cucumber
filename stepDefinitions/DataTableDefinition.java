package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableDefinition {
	@Given("user is on sign up screen")
	public void user_is_on_sign_up_screen() {
	    System.out.println("Given");
	}
	@Then("user enter details")
	public void user_enter_details(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>>data=dataTable.asLists();
	    System.out.println(data.get(0).get(0)+" "+data.get(0).get(1));
	    System.out.println(data.get(1).get(0)+" "+data.get(1).get(1));
	    System.out.println(data.get(2).get(0)+" "+data.get(2).get(1));

	}

}
