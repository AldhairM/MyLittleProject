package apiPageObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetUP {
	public Response response;
	public RequestSpecification request;
	
	public SetUP() {
		RestAssured.baseURI = "https://reqres.in/api/";
		request = RestAssured.given();
	}
	
}
