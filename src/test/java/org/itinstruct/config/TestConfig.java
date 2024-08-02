package org.itinstruct.config;

import org.junit.Test;

import java.io.IOException;

public class TestConfig {

    @Test
    public void testConfigProperties() throws IOException {
        PropertiesReader reader = new PropertiesReader();

        System.out.println(reader.getPropertyData("url"));
        System.out.println(reader.getPropertyData("browser"));
    }
}
