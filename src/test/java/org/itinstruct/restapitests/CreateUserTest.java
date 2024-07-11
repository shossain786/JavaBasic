package org.itinstruct.restapitests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.itinstruct.restapi.CreateUserRequest;
import org.itinstruct.restapi.CreateUserResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class CreateUserTest {
    @Test
    public void createUserByPojo() {
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

        CreateUserResponse createUserResponse = response.getBody().as(CreateUserResponse.class);
        Assert.assertEquals("Saddam Hossain", createUserResponse.getName());
    }

    @Test
    public void createUserByFile() {
        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\CreateUser.json";
        File file = new File(filePath);

        Response response = RestAssured.given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(file)
                .post("/api/users");

        System.out.println(response.statusCode());
        System.out.println(response.getBody().prettyPrint());
    }
}
