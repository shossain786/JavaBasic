Feature: Demo API test with cucumber

  Scenario: get single product
    Given I have application baseurl
    When I set endpoint url as "/product/1"
    And  I set header value of "Content-Type" as "application/json"
    And  I hit get request
    Then I verify response code as 200
    And  I should see "category" is "beauty"

  Scenario: search product
    Given I have application baseurl
    When I set endpoint url as "/products/search?q=phone"
    And  I set below values in header
      | headerKey    | headerValue      |
      | Content-Type | application/json |
      | Accept       | application/json |
    And  I hit get request
    Then I verify response code as 200
    And  I should see "products[0].category" is "mobile-accessories"


#    Steps should be written by using keywords like Given, When, Then, And, But
#  baseURL, header information, body(optional), method-type(Get, post, delete, put), response