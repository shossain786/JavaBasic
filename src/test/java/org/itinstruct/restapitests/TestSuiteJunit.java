package org.itinstruct.restapitests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestSuiteJunit {
    @Before
    public void setUp(){
        RestAssured.baseURI = "https://reqres.in";
    }
    @After
    public void tearDown(){
//        for closeup/clean up activity
        System.out.println("inside after method\n\n");
    }
    @Test
    public void headerMapTest() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Content-Type","application/json");
        hashMap.put("Accept", "application/json");

        Response response =  RestAssured.given()
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
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .get("/api/users/2");

        System.out.println(response.statusCode());
        System.out.println(response.getHeader("Content-Type"));
//        System.out.println(response.headers());
    }
}
