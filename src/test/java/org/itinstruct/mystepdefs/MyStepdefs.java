package org.itinstruct.mystepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I have application baseurl")
    public void iHaveApplicationBaseurl() {
    }
    @When("I set endpoint url as {string}")
    public void i_set_endpoint_url_as(String string) {
    }
    @When("I set header value of {string} as {string}")
    public void i_set_header_value_of_as(String string, String string2) {
    }
    @When("I hit get request")
    public void i_hit_get_request() {
    }
    @Then("I verify response code as {int}")
    public void i_verify_response_code_as(Integer int1) {
    }
    @Then("I should see {string} is {string}")
    public void i_should_see_is(String string, String string2) {
    }
}
