package org.itinstruct.restapitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class ValidateData {
    @Test
    public void testJsonPath(){
        Response response = RestAssured.given().baseUri("https://dummyjson.com/products/category/smartphones")
                .get();

        System.out.println(response.statusCode());
//        System.out.println(response.getBody().prettyPrint());

        JsonPath jsonPath = response.jsonPath();
        String actualProduct = jsonPath.getString("products[2].title");

        Assert.assertEquals("iPhone 13", actualProduct);
    }
}
