package TestProjects.EmployeeAPI_Test_Project;

import io.restassured.RestAssured;
import models.createEmployee;
import org.testng.annotations.Test;

public class Tests_Serialized_Basic {





    @Test
    public void CreateEmployee(){
        String endpoint = "http://dummy.restapiexample.com/api/v1/create";
        createEmployee createEmployee = new createEmployee("testName","TestSalary","35");

        RestAssured
                .given()
                .body(createEmployee)
                .log()
                .all()
                .when()
                .post(endpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

    }


    @Test
    public void UpdateEmployee(){
        String endpoint = "http://dummy.restapiexample.com/api/v1/update/2";
        createEmployee updateEmplyee = new createEmployee("name", "2500", "25");
        RestAssured
                .given()
                .body(updateEmplyee)
                .log()
                .all()
                .when()
                .put(endpoint)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void DeleteEmployee(){
        String endpoint = "http://dummy.restapiexample.com/api/v1/employees";


    }



}
