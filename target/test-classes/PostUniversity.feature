Feature: user is able to post the data in database 
Scenario: user wants to post the data 
Given user is able to provide the data in database
When user gives the data by using url "http://localhost:8080/university"
Then  user validates that status code is 200

