package org.itinstruct.restapitests.mytestng;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.itinstruct.restapi.CreateUserRequest;
import org.itinstruct.restapi.CreateUserResponse;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateUserTest extends TestBase {
    @BeforeMethod
    public void setUp(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
        System.out.println(createUserResponse.getName());
    }

    @Test
    public void createUserTest(){
        System.out.println("Insdie createUserTest");
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setName("Saddam Hossain");
        createUserRequest.setJob("Java Tutor");

        Response response = RestAssured.given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(createUserRequest)
                .post("/api/users");

        System.out.println(response.statusCode());
        System.out.println(response.getBody().prettyPrint());

        createUserResponse = response.getBody().as(CreateUserResponse.class);
        Assert.assertEquals("Saddam Hossain", createUserResponse.getName());
    }

    @Test
    public void updateUserTest(){
        System.out.println("Insdie updateUserTest");
        System.out.println(createUserResponse.getName());
    }
}
