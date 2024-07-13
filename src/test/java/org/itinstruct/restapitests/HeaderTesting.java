package org.itinstruct.restapitests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

public class HeaderTesting {
    @Test
    public void headerMapTest() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Content-Type","application/json");
        hashMap.put("Accept", "application/json");

        Response response =  RestAssured.given()
                .baseUri("https://reqres.in")
                .headers(hashMap)
                .get("/api/users/2");

        System.out.println(response.statusCode());
        System.out.println(response.getHeader("Content-Type"));
//        System.out.println(response.headers());
    }
    @Test
    public void headerClassTest() {
        Header header1 = new Header("Content-Type", "application/json");
        Header header2 = new Header("Accept", "application/json");

        Response response =  RestAssured.given()
                .baseUri("https://reqres.in")
                .header(header1)
                .header(header2)
                .get("/api/users/2");

        System.out.println(response.statusCode());
        System.out.println(response.getHeader("Content-Type"));
//        System.out.println(response.headers());
    }
    @Test
    public void headerTest() {
        Response response =  RestAssured.given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .get("/api/users/2");

        System.out.println(response.statusCode());
        System.out.println(response.getHeader("Content-Type"));
        System.out.println(response.headers());
    }
}
