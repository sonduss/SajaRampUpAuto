package Pages;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FailLogin {

  public void loginFail()
  {

        String loginPayload = "{"
                + "\"email\": \"mmerchant@foodics.com\","
                + "\"password\": \"1123456\","
                + "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\""
                + "}";
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(loginPayload)
                .when()
                .post("/login");
        response.then()
                .assertThat()
                .statusCode(500);
    }

}
