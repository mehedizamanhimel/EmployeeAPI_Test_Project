package petStore_Pets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class CreatingPet {

    JsonObject json = new JsonObject();
    JsonArray jArray = new JsonArray();
    JsonPath jsonResponse;

    public void CreateNewPet(String body, String salary, String age, String name) {

        json.addProperty("name", name);
        json.addProperty("salary", salary);
        json.addProperty("age", age);

        

        RestAssured.baseURI="https://petstore.swagger.io/v2";
        RestAssured.basePath="/pet";

        jsonResponse = new JsonPath(
                RestAssured
                        .given()
                        .contentType("application/json")
                        .body(json.toString())
                        .log()
                        .all()
                        .when()
                        .post()
                        .asString());


        jsonResponse.prettyPrint();

    }

}
