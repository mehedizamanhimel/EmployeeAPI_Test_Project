package TestProjects.EmployeeAPI_Test_Project;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class delete_DeleteSingleEmployeeInformation {
	
	JsonPath jsonresnponse;
	JsonObject json = new JsonObject();
	
	public void deleteExistingEmployee() {
	
		RestAssured.baseURI="http://dummy.restapiexample.com";
		RestAssured.basePath= "";
		
	jsonresnponse = new JsonPath(
			RestAssured
			.given()
			.when()
			.delete()
			.asString());
			
	
	jsonresnponse.prettyPrint();
			
			
			
			
			
		
	}
	

}
