# Test Name : Login_Test
# Description : Tests the login feature of HRM application
# Author : Praveen
# Date : 15-03-2018

Feature: Login Test

Scenario: As per the US0001, validate the login functionality of the Orange HRM application

Given I want to launch the firefox browser
And I need to maximize it
When It maximizes enter the URL
Then I need to enter valid credentials
|user01|pass1234|
And I close the browser