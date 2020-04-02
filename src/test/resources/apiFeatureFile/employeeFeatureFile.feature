@LogIn
Feature: Employee feature
  @GetEmployees
  Scenario: Title of your scenario
    Given User set valid auth key
    When User send a Getrequest on "users"
    Then User should get status code 200
    
  @GetEmployeer
  Scenario: User will get an employers data
    Given User set valid auth key
    And User send an id as 2
    When User send a Getrequest on "user/{id}"
    Then User should get status code 200
    
