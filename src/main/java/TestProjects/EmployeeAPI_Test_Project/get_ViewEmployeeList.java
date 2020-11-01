package TestProjects.EmployeeAPI_Test_Project;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class get_ViewEmployeeList {
	
	public get_ViewEmployeeList(){
		
	}

	JsonPath jsonresnponse;
	
	public void getEmployeeList() {
	
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		RestAssured.basePath = "/api/v1/employees";
		
		jsonresnponse = new JsonPath(
				RestAssured
				.given()
				.when()
				.get()
				.asString());
		
		jsonresnponse.prettyPrint();
							
	}
	
	//From this method, user will get the data for a particular employee from a list.
	public String returnResponse(int i) {
		return jsonresnponse.getString("data.get[" +i+"].data");
	}

}
