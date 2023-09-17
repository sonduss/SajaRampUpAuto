import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import Pages.*;


 class LoginTestCases {

    @BeforeClass
    public void setUp()
    {
        RestAssured.baseURI = "https://pay2.foodics.dev/cp_internal";
    }

     @Test(priority = 0)
    public void verifyCanUserLogin()
    {
        PassLogin PassLogin_ = new PassLogin ();
        PassLogin_.loginPass();
    }


     @Test(priority =1)
     public void verifyCannotUserLogin()
     {
         FailLogin FailLogin_ = new FailLogin ();
         FailLogin_.loginFail();
     }

     @Test (priority = 2)
    public void validateloginresponseTime() {
         ResponseTime ResponseTime = new ResponseTime ();
         ResponseTime.validateloginresponseTime();

    }
}



