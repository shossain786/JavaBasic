package org.itinstruct.restapitests.mytestng;

import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void loginUserTest(){
        System.out.println("Inside login test");
        System.out.println(createUserResponse.getName());
    }
}
