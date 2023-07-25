package stepDefinitions;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumDefinition {
	ChromeDriver driver ;
	@Given("User is on the makemytrip login")
	public void user_is_on_the_makemytrip_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Day 2 Testing\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@When("user enters phonenumber {string}")
	public void user_enters_phonenumber(String string) throws InterruptedException {
		 driver.findElement(By.id("username")).sendKeys(string);
		 Thread.sleep(3000);
	    
	}
	@When("user clicks continue")
	public void user_clicks_continue() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-cy='continueBtn']")).click();
	  Thread.sleep(3000);
	}
	@Then("otp is sent {string}")
	public void otp_is_sent(String string1) throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-cy='enterOtp']")).sendKeys(string1);
		Thread.sleep(3000);
	}
	@Then("otp is validated")
	public void otp_is_validated() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-cy='verifyAndCreate']")).click();
		Thread.sleep(3000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("document.elementFromPoint(0,0).click()");
	}
	
	
}
//"//span[text()='Login']"