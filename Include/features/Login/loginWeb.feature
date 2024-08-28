@tag
Feature: As a user, I want to login in Secondhand Binar website

  #@TC.Login.001
  #Scenario: User want to login using correct credential						
    #Given User success landing in secondhand binar website
    #And User click Masuk button on the top right side
    #And User input valid Email "Binarbootcamp@gmail.com"
    #And User input valid Password "123456"
    #And User click button Masuk
    #Then User can login after input correct credential
    #And User navigate to Homepage
    #
  #@TC.Login.002
  #Scenario: User want to login using invalid Email and Password credential 							
    #Given User success landing in secondhand binar website
    #And User click Masuk button on the top right side
    #And User input valid Email "Binar"
    #And User input valid Password "1"
    #And User click button Masuk
    #Then User can login after input correct credential
    #And User stay in Loginpage
    #
  #@TC.Login.003
  #Scenario: User want to login using invalid Email and valid Password			
    #Given User success landing in secondhand binar website
    #And User click Masuk button on the top right side
    #And User input valid Email "~"
    #And User input valid Password "123456"
    #And User click button Masuk
    #Then User can login after input correct credential
    #And User stay in Loginpage
    
  @TC.Login.004
  Scenario: User want to login using valid Email and invalid Password			
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input valid Email "Binarbootcamp@gmail.com"
    And User input valid Password "1"
    And User click button Masuk
    Then User can login after input correct credential
    And User stay in Loginpage
    
    