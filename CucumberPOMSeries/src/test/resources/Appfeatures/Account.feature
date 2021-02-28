#Feature: Account Page Feature
#
#Background:
#Given user has already logged in to application 
#|username            | password |
#|test1414@example.com| testing  |
#
#Scenario: Accounts page title
#Given user is on Accounts page
#When user gets the title of the page
#Then title should be "My account - My Store"
#
#Scenario Outline:
#Given user is on Accounts page
#Then usert verify "<MyAccountslinks>"
#And account section count should be 6
#
#Examples:
#|MyAccountslinks|
#|Order history and details|
#|My credit slips|
#|My Addresses|
#|My personal informaton|
#|My wishlists |
#|Home |
#
