@Websit @Login @Smoke
Feature: Login

  @TC.Login.001
  Scenario: User want to login using valid credential						
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input correct Email "Binarbootcamp@gmail.com"
    And User input correct Password "123456"
    And User click button Masuk
    Then User can login after input valid credential
    And User navigate to Homepage
    
  @TC.Login.002
  Scenario: User want to login using incorrect email and password  							
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input incorrect Email "Binarboot@gmail.com"
    And User input incorrect Password "1"
    And User click button Masuk
    Then User cannot login after input invalid credential
     And Verify warning message Invalid Email or password
    And User stay in Loginpage
    
  @TC.Login.003
  Scenario: User want to login using incorrect Email and correct Password			
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input incorrect Email "Binarboot@gmail.com"
    And User input correct Password "123456"
    And User click button Masuk
    Then User cannot login after input invalid credential
     And Verify warning message Invalid Email or password
    And User stay in Loginpage
    
  @TC.Login.004
  Scenario: User want to login using valid Email and invalid Password			
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input valid Email "Binarbootcamp@gmail.com"
    And User input incorrect Password "1"
    And User click button Masuk
    Then User cannot login after input invalid credential
    And Verify warning message Invalid Email or password
    And User stay in Loginpage
    
    @TC.Login.005
  Scenario: User want to login without fill in the Email and Password field.			
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User doesnt fill in the Email field ""
    And User doesnt fill in the Password field ""
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
     @TC.Login.006
  Scenario: User want to login without fill in the Email field and input correct Password.		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User doesnt fill in the Email field ""
    And User input correct Password "123456"
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
    @TC.Login.007
  Scenario: User want to login without fill in the Email field and input incorrect Password.		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User doesnt fill in the Email field ""
    And User input incorrect Password "1"
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
    @TC.Login.008
  Scenario: User want to login without fill in the Password field and input correct Email.		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input correct Email "Binarbootcamp@gmail.com"
    And User doesnt fill in the Password field ""
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
    @TC.Login.009
  Scenario: User want to login without fill in the Password field and input incorrect Email		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input incorrect Email "Binarboo@gmail.com"
    And User doesnt fill in the Password field ""
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
    @TC.Login.010
  Scenario: User want to login using invalid Email format and input correct Password		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input invalid Email "Binarbootcampcom"
    And User input correct Password "123456"
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
    @TC.Login.011
  Scenario: User want to login using invalid email format and input incorrect password		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input invalid Email "Binarbootcampcom"
    And User input incorrect Password "1"
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    
    @TC.Login.011
  Scenario: User want to login using invalid email format and input empty password		
    Given User success landing in secondhand binar website
    And User click Masuk button on the top right side
    And User input invalid Email "Binarbootcampcom"
    And User doesnt fill in the Password field ""
    And User click button Masuk
    Then User cannot login after input invalid credential
    And User stay in Loginpage
    