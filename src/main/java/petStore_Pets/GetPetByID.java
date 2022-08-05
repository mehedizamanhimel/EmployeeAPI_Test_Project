package petStore_Pets;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetPetByID {

    JsonPath jsonresnponse;

    public void FindingPetByID(String petID) {

        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.basePath = "/pet/"+petID;

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
