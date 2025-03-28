package com.airam;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class ApplicationTest {

        // Método que verifica el código de estado HTTP de la respuesta
        @Test
        public void verifyStatusCode() {

            // Preparación de la solicitud
            given()
                .when()
                    // Realiza la solicitud GET al endpoint
                    .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                    // Verifica que el código de estado sea 200 (OK)
                    .statusCode(200);
        }
        @Test
        public void verifyUserId() {
            given()
                    .when()
                    .get("https://jsonplaceholder.typicode.com/posts/1")
                    .then()
                    .body("userId", equalTo(1));
        }

        @Test
        public void verifyContentTypeHeader() {
        given()
        .when()
        .get("https://jsonplaceholder.typicode.com/posts/")
        .then()
        .header("Content-Type", "application/json; charset=utf-8");
        }

        @Test
        public void postRequest() {
            String requestBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";
            given()
                .contentType("application/json")
                .body(requestBody)
            .when()
            .post("https://jsonplaceholder.typicode.com/posts")
            .then()
            .statusCode(201)
            .body("title", equalTo("foo"))
            .body("body", equalTo("bar"))
            .body("userId", equalTo(1));

        }
        @Test
        public void verifyStatusCode2() {

            // Preparación de la solicitud
            given()
                .when()
                    // Realiza la solicitud GET al endpoint
                    .get("https://jsonplaceholder.typicode.com/comments/5")
                .then()
                    // Verifica que el código de estado sea 200 (OK)
                    .statusCode(200);
        }

        @Test
        public void verifyUserId2() {
            given()
                    .when()
                    .get("https://jsonplaceholder.typicode.com/todos")
                    .then()
                    .body("[0].userId", equalTo(1));
        }

        @Test
        public void verifyMoreThanFivePostsForUserId() {
            given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts?userId=1")

            .then()
            .body("size()", greaterThan(5));
            }

}

