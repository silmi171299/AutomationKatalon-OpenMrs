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
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Register a new patient
  I want to register a new patient
  
  Background: 
  Given User already login in OpenMrs as Inpatient Ward

  @tag1
  Scenario Outline: Register a new patient
    Given User is on Homepage
    When User click Register a patient Menu
    And User input GvnName <givenname>
    And User input MiddleName <middlename>
    And User input FamilyName <familyname>
    And User click next button
    And User select Gender <gender>
    And User click next button
    And User input BirthDate <birthdate>
    And User select BirthMonth <birthmonth>
    And User input BirthYear <birthyear>
    And User click next button
    And User input PatientAddress1 <address1>
    And User input PatientAddress2 <address2>
    And User input City <city>
    And User input Province <province>
    And User input Country <country>
    And User input PostalCode <postalcode>
    And User click next button
    And User input PhoneNumber <phonenumber>
    And User click next button
    And User select RelationType <relationtype>
    And User input PersonName <personname>
    And User click next button
    And User click Confirm button
    #Then User successfully to register a new patient
   	Then User successfully to register a new patient <familyname>
    
    Examples: 
      | givenname | middlename | familyname | gender 		| birthdate | birthmonth | birthyear | address1 | address2 | city 		| province	 | country 	 | postalcode | phonenumber	 | relationtype 													| personname |
      | Silmi  		| Sil		  	 | Silvia   	| F     		| 17				| 12 		 		 | 1999 		 | Alamat 	| Lengkap  | Bandung	| Jawa Barat | Indonesia | 40291			| 085866879900 | 8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A	|	Saudara		 |
    