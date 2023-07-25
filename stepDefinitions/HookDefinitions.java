package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookDefinitions {
	
	@Before("@SmokeTest") 
	public void beforeFeature()
	{
		System.out.println("Before Scenario");
	}
	@After("@SmokeTest") 
	public void afterFeature()
	{
		System.out.println("After Scenario");
	}
	@Given("example of given one")
	public void example_of_given_one() {
	    System.out.println("Given one Mobile Test");
	}
	@When("example of when one")
	public void example_of_when_one() {
		System.out.println("When one Mobile Test");
	}
	@Then("example of then one")
	public void example_of_then_one() {
		System.out.println("Then one Mobile Test");
	}
	
	@Given("example of given two")
	public void example_of_given_two() {
		System.out.println("Given two Website Test");
	}
	@When("example of when two")
	public void example_of_when_two() {
		System.out.println("When two Website Test");
	}
	@Then("example of then two")
	public void example_of_then_two() {
		System.out.println("Then two Website Test");
	}
}
