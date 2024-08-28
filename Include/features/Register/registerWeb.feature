@tag
Feature: As a User, I want to register account in Secondhand Binar website

  @TC.Reg.001
  Scenario: User want to registration correctly
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Input valid Name field "Katalon2"
    And Input valid Email field
    And Input valid Password field "123456"
    And Click Daftar button
    Then User success registration account
    And User can see homepage

  @TC.Reg.002
  Scenario: User want to register without input name, email, and password
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Leave Name field blank
    And Leave Email field blank 
    And Leave Password field blank 
    And Click Daftar button
    Then User cannot registration account
    And User stay in login page 
    
  @TC.Reg.003
  Scenario: User want to register only input name
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Input valid Name field "Katalon2"
    And Leave Email field blank
    And Leave Password field blank
    And Click Daftar button
    Then User cannot registration account
    And User stay in login page 
      
  @TC.Reg.004
  Scenario: User want to register only input email
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Leave Name field blank
    And Input valid Email field 
    And Leave Password field blank
    And Click Daftar button
    Then User cannot registration account
    And User stay in login page 
    
  @TC.Reg.005
  Scenario: User want to register only input password
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Leave Name field blank
    And Leave Email field blank
    And Input valid Password field "123456"
    And Click Daftar button
    Then User cannot registration account
    And User stay in login page 
    
  @TC.Reg.006
  Scenario: User want to register with invalid email format
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Input valid Name field "Katalon2"
    And Input invalid Email field 
    And Input valid Password field "123456"
    And Click Daftar button
    Then User cannot registration account
    And User stay in login page 
    
  @TC.Reg.007
  Scenario: User want to register with under 6 digit password
    Given User landing in secondhand binar website
    When Click Masuk button on the top right side
    And Click Daftar di sini button
    And Input valid Name field "Katalon2"
    And Input valid Email field 
    And Input password under 6 digit "123"
    And Click Daftar button
    Then User cannot registration account
    And User stay in login page 
    
