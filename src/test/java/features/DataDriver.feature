Feature: data driven

#  Scenario: Open the Flipkart app and search for Iphone phone
#    Given launch browser "chrome"
#    And enter the url "https://flipkart.com" and close login popup
#    When in search bar enter "iphone" as item name
#    Then print all the iphone device names

  Scenario Outline: navigate to demo qa site and create multiple students
     Given launch browser "chrome"
      And Enter the url "https://demoqa.com/automation-practice-form"
      When student registration page is displayed enter "<firstname>", "<lastname>", "<email>" and "<phone_number>"
      Then close browser
    Examples:
    |firstname|lastname|email|phone_number|
    |student1 |stu1    |st1@gmail.com|1234|
    |student2 |stu2    |st2@gmail.com|56789|
    |student3 |stu3    |st3@gmail.com|73274|

