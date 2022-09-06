Feature: Login module

  @SmokeTest
  Scenario: As a user I want to login to app with valid credentials
    #Gherkin keywords
    Given launch browser
    And enter the url
    When login page is displayed enter valid username and password
    And click on submit button
    Then home page should be displayed

    @RegressionTest
  Scenario: As a user I want to login to app with invalid credentials
    Given launch browser
    And enter the url
    When login page is displayed enter invalid username and password
    And click on submit button
    Then Error message should display

      @End2End
  Scenario Outline: this scenario will be executed multiple times
    Given launch browser
    And enter the url
    When login page is displayed enter invalid "<username>" and "<password>"
    And click on submit button
    Then Error message should display
    Examples:
      | username | password |
      | user1    | pwd1     |
      | user2    | pwd2     |
      | user3    | pwd3     |

