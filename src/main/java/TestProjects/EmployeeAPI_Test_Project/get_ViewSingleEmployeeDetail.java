package TestProjects.EmployeeAPI_Test_Project;


import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class get_ViewSingleEmployeeDetail {

	


	JsonObject json = new JsonObject();
	JsonPath jsonresponse;
	
	
	public void viewingEmployeeDetail(int emp_ID) {
		
		RestAssured.baseURI="http://dummy.restapiexample.com";
		RestAssured.basePath="/api/v1/employee/"+emp_ID;
		
		jsonresponse=new JsonPath(
				RestAssured
				.given()
			//	.contentType("application/json")
				.log()
				.all()
				.when()
				.get()
				.asString());
				
		jsonresponse.prettyPrint();
				
				
		
	}
	
	public String getData() {
		return jsonresponse.getString("");
	}
	
	public String getEmployeeID() {
		return jsonresponse.getString("data.id").toString();
	}
	
	public String getStatus() {
		return jsonresponse.getString("status");
	}

	public String getMessage() {
		return jsonresponse.getString("message");
	}
	


}
