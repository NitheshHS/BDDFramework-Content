Feature: data driven

  Scenario: Open the Flipkart app and search for Iphone phone
    Given launch browser "chrome"
    And enter the url "https://flipkart.com" and close login popup
    When in search bar enter "iphone" as item name
    Then print all the iphone device names
