package org.itinstruct.restapitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class GetUserWithAutherization {
    @Test
    public void getUser() {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://dummyjson.com/");
//        generate token at runtime
        String token = getToken();

        request.headers("Authorization", token);
        Response response = request.get("auth/me");

        System.out.println(response.statusCode());
        System.out.println(response.body().prettyPrint());
    }

    public String getToken() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://dummyjson.com/");
        requestSpecification.headers("Content-Type", "application/json");
        String body = "{\n" +
                "    \"username\": \"kminchelle\",\n" +
                "    \"password\": \"0lelplR\",\n" +
                "    \"expiresInMins\": 30\n" +
                "  }";

        Response response = requestSpecification.body(body).post("auth/login");
        JsonPath jsonPath = response.jsonPath();
        String token = jsonPath.getString("token");
        System.out.println("Token fetched: "+ token);
        return token;
    }
}
