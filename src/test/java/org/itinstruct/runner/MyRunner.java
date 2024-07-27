package org.itinstruct.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
        "src/test/resources/feature/login/",
        "src/test/resources/feature/create_user/"
        },
        glue = {"org.itinstruct.mystepdefs"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/reports/cucumber_report.html",
                "json:target/reports/cucumber_report.json",
                "rerun:target/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        tags = ""
        )
public class MyRunner {
}
