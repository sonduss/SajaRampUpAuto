package Pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.lessThan;

public class ResponseTime {

    public void validateloginresponseTime ()
    {
        String loginPayload = "{"
                + "\"email\": \"34343@foodics.com\","
                + "\"password\": \"1e3433456\","
                + "\"token\": \"Lyz22cfYetFhKQybx5HAmVimF1i0xO\""
                + "}";

        Response response = RestAssured.given()
                .contentType("application/json")
                .body(loginPayload) // Set the JSON payload
                .when()
                .post("/login");

        response.then()
                .assertThat()
                .time(lessThan(Long.valueOf(2000)));
    }
}
