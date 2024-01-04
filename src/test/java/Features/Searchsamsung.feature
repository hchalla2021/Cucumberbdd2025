@RegressionTesting
Feature: Verify and Search pricut name in amazon application
  Scenario: Search product name in amazon application
    Given User launch amazon application using chrome browser
    When User navigate  to url "https://www.amazon.in/"
    And User Enter product name is "Samsung"
    When User click on Search button
    Then close the browser
