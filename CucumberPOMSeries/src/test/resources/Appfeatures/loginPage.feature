Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forget Password link
Given user is on login page
Then forgerget your password link should be displayed

Scenario Outline: Login with correct credentials
Given user is on login page
When user enters username "<UserName>"
And user enters password "<Password>"
And user clicks on login button
And page titile should be "My account - My Store"
  Examples:
  | UserName            | Password |
  |test1414@example.com | testing  |