package org.itinstruct.restapitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestAPITEST {
    @Test
    public void testGetAPI() {
        Response response = given()
                .baseUri("https://dummyjson.com")
                .get("product/1");

        System.out.println(response.statusCode());
        System.out.println(response.getBody().prettyPrint());
    }

    @Test
    public void testGETAPICall() {
        given();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given().get("product/1");
        System.out.println(response.statusCode());
        System.out.println(response.body().prettyPrint());
    }

    @Test
    public void testPOSTAPI(){
        String endPoint = "/products/add";
        String payLoad = "{\n" +
                "    \"title\": \"BMW Laptop\"\n" +
                "}";
        Response response = given()
                .baseUri("https://dummyjson.com")
                .header("Content-Type","application/json")
                .body(payLoad)
                .post(endPoint);

        System.out.println(response.statusCode());
        System.out.println(response.body().prettyPrint());
    }


}
