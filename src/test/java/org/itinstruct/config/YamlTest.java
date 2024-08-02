package org.itinstruct.config;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class YamlTest {

    @Test
    public void fetchYamlData() throws FileNotFoundException {
        String filePath = "config/config.yaml";
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(new File(filePath));
        Config config = yaml.loadAs(inputStream, Config.class);

        System.out.println(config.getApi().getBaseURL());
        System.out.println(config.getApi().getHeaders().getAccept());
    }
}
