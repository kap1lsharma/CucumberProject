Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login | Salesforce"

#
#Scenario: Forgot Password link
#Given user is on login page
#Then forgot your password link should be displayed
#
#Scenario: Login with correct credentials 
#Given user is on login page
#When user enters username "samriddh.malik@psagtechnologies.com.psagorg.qa"
#And user enters password "SAMRIDDH@123"
#And user clicks on login button
#Then user gets the title of the home page
#And home page title should be "Recently Viewed | Integration Masters | Salesforce"