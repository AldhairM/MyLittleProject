package trulyApi;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssure {
	public Response response;
	public RequestSpecification request;
	
	int id;
	
	@BeforeTest()
	public void setUp(){
	RestAssured.baseURI = "https://reqres.in/api";
	request = RestAssured.given();
	}
	
	@Test()
	public void Test1() {
		response = request
				.given()
				.when()
				.get("users");
		System.out.println(response.toString());
	}


	@Test(enabled = false)
	public void Test23() {
		response = request
				.given()
				.pathParam("id", 2)
				.when()
				.get("users/{id}");

		response.then().statusCode(200);
		
		System.out.println(response.prettyPrint());
		
		Assert.assertTrue(response.body().jsonPath().get));
	}
	

	
	@Test()
	public void Test2() {
		JSONObject json = new JSONObject();
		
		json.put("name", "antonio");
		json.put("job", "Estudiante");
		String jsonString = json.toString();
		
		response = request
				.given()
				.contentType(ContentType.JSON)
				.body(jsonString)
				.when()
				.post("users");
		response.then().statusCode(201);
		
		System.out.println(response.prettyPrint());
		System.out.println(response.body()
				.jsonPath()
				.getInt("id"));
		id = response.body().jsonPath().getInt("id");
	}
	
	@Test()
	public void Test3() {
		response = request
				.given()
				.pathParam("id", 2)
				.when()
				.get("users/{id}");

		response.then().statusCode(200);
		
		System.out.println(response.prettyPrint());
		
		Assert.assertTrue(response.body().jsonPath().getList(path));
	}
	
	@Test()
	public void Test4() {
		
		response = request
				.given()
				.pathParam("id", id)
				.when()
				.delete("users/{id}");
		response.then().statusCode(204);
		
		System.out.println(response.prettyPrint());
	}
}
