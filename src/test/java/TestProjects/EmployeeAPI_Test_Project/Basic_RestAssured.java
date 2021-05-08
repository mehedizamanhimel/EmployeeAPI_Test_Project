package TestProjects.EmployeeAPI_Test_Project;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import javax.xml.ws.Response;

public class Basic_RestAssured {

    // Creating a simple get request and verifying the status code
    @Test
    public void test_GetemployeeList_VerifyStatusCode(){
        String baseurl= "http://dummy.restapiexample.com/api";
        String basepath= "/v1/employees";
        String endpoint = "http://dummy.restapiexample.com/api/v1/employees";
        RestAssured
                .given()
                .when()
                .get(endpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    // Creating a simple get request with pathparam and verifying the status code
    @Test
    public void test_Getemployee_VerifyStatusCode(){

        String baseurl= "http://dummy.restapiexample.com/api";
        String basepath= "/v1/employee/1";
        String enpoint = "http://dummy.restapiexample.com/api/v1/employee/1";
        RestAssured
                .given()
                .when()
                .get(enpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    // Creating a simple post request and verifying the status code
    @Test
    public void CreateEmployee(){
        String enpoint = "http://dummy.restapiexample.com/api/v1/create";
        String body= "" +
                "{name\":\"test12\"," +
                "salary\":\"12345\"," +
                "age\":\"234\"}";

        RestAssured.given()
                .body(body)
                .when()
                .post(enpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    // Create a put api for updating existing employee info
    @Test
    public void UpdateEmployee(){
        String enpoint = "http://dummy.restapiexample.com/api/v1/update/2";
        String body= "" +
                "{name\":\"test12\"," +
                "salary\":\"12345\"," +
                "age\":\"234\"}";

        RestAssured
                .given()
                .body(body)
                .when()
                .put(enpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    // Create a put api for updating existing employee info
    @Test
    public void DeleteEmployee(){
        String enpoint = "http://dummy.restapiexample.com/api/v1/delete/2";

        RestAssured
                .given()
                .when()
                .delete(enpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }
}
