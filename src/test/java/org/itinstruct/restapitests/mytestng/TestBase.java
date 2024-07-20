package org.itinstruct.restapitests.mytestng;

import org.itinstruct.restapi.CreateUserResponse;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static CreateUserResponse createUserResponse;
    @BeforeSuite
    public void beforeTest() {
        System.out.println("Before Test Method");
        if (createUserResponse != null) {
            System.out.println(createUserResponse.getName());
        }
    }
}
