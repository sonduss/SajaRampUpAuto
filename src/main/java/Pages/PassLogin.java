package Pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PassLogin {

    public  void loginPass() {
        String loginPayload = "{"
                + "\"email\": \"merchant@foodics.com\","
                + "\"password\": \"123456\","
                + "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\""
                + "}";
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(loginPayload)
                .when()
                .post("/login");
        response.then()
                .assertThat()
                .statusCode(200);
    }
}