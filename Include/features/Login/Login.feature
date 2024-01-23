#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#BackgroUserund: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to login OpenMrs website

  @TC01
  Scenario: Login using valid credential
    Given User access OpenMrs website
    When User input valid username
    And User input valid password
    And User click location for session login
    And User click login button
    Then User Redirect to Homepage
  
  @TC02
  Scenario: Login with blank username
    Given User access OpenMrs website
    When User input valid password
    And User click location for session login
    And User click login button
    Then User see error message on the Login page
    
  @TC03
  Scenario: Login with blank password
    Given User access OpenMrs website
    When User input valid username
    And User click location for session login
    And User click login button
    Then User see error message on the Login page
  
  @TC04
  Scenario: Login with blank username and password
    Given User access OpenMrs website
    And User click location for session login
    And User click login button
    Then User see error message on the Login page
    
  @TC05
  Scenario Outline: Login using invalid credential
    Given User access OpenMrs website
    When User input invalid username <username> and password <password>
    And User click location for session login
    And User click login button
    Then User see error message on the Login page
    
		
    Examples: 
      | username  | password  |
      | adminnn		| Admin123  |
      | Admin			| Admin111  |
      | adminn1		| admin122  |
      | -@dmin		| Admin12#	|
      | Admin			| Admin12@  |