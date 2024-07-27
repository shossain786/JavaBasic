package org.itinstruct.mystepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.itinstruct.ProjectConstants;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyStepdefs {
    String endpointURL;
    Response response;
    Map<String, String> headerMap = new HashMap<>();
    RequestSpecification request = RestAssured.given();
    @Given("I have application baseurl")
    public void iHaveApplicationBaseurl() {
        request.baseUri(ProjectConstants.BASE_URI);
    }
    @When("I set endpoint url as {string}")
    public void i_set_endpoint_url_as(String endPointURL) {
        endpointURL = endPointURL;
    }
    @When("I set header value of {string} as {string}")
    public void i_set_header_value_of_as(String key, String value) {
        request.header(key, value);
    }
    @When("I hit get request")
    public void i_hit_get_request() {
        response = request.get(endpointURL);
        System.out.println(response.getBody().prettyPrint());
    }
    @Then("I verify response code as {int}")
    public void i_verify_response_code_as(Integer statusCode) {
        System.out.println("Status code: " + response.statusCode());
        Assert.assertEquals(response.statusCode(), statusCode);
    }
    @Then("I should see {string} is {string}")
    public void i_should_see_is(String jsonKey, String expectedValue) {
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.getString(jsonKey), expectedValue);
    }

    @And("I set below values in header")
    public void iSetBelowValuesInHeader(DataTable dataTable) {
        List<Map<String, String>> rawData = dataTable.asMaps();
        for (Map<String, String> map : rawData) {
            headerMap.put(map.get("headerKey"), map.get("headerValue"));
        }
        request.headers(headerMap);
    }
}
