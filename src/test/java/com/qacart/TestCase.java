package com.qacart;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCase {
    @Test
    public void test(){
        given().baseUri("https://642838a2161067a83b098ee7.mockapi.io")
                .when().get("/api/v1/users")
                .then().log().ifValidationFails()
                .assertThat().body("[0].name",equalTo("Bruce1 Walter"));

    }
}
