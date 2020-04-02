package apiStepDefinitions;

import org.testng.Assert;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class employeesStepDefinitions {
	
	Response resp;
	GetEmployees employees;
	int id;
	
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() {
	    System.out.println("hello");
	    }
	
	@Given("User send an id of {int}")
	public void user_send_an_id_of(int id) {
	    this.id = id;
	    }
	
	@When("User send a Getrequest on {string}")
	public void user_send_a_Getrequest_on(String endPoint, int id) {
		employees = new GetEmployees(endPoint);
		}

	@Then("User should get status code {int}")
	public void user_should_get_status_code(Integer int1) {
		System.out.println("Respones: "+ employees.response.asString());
		Assert.assertTrue(employees.response.getStatusCode()== statusCode );
		}

}
