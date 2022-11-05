Feature: a user is able to get all the data from data base
Scenario: a user wants to retrive the data from data base
When a user is able to retrive the data by using api "http://localhost:8080/alluniversity"
Then a user validate that status code is 200
  