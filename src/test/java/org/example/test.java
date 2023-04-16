package org.example;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


class test {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));
    }
}