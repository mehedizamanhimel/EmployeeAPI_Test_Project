package petStore_Pets;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetPetByStatus {

    JsonPath jsonresnponse;

    public void FindingPetByStatus(String status) {

        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.basePath = "/pet/findByStatus?status="+status;

        jsonresnponse = new JsonPath(
                RestAssured
                        .given()
                        .when()
                        .get()
                        .asString());

        jsonresnponse.prettyPrint();

    }

    public String getValue(){
        return jsonresnponse.getString("");
    }
}
