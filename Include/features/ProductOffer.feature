
@Website @ProductOffer @Smoke
Feature: Add New Product
  As a user, I can edit and add new product in SecondHand


 @TC.PO.001
 Scenario: Clicking the Saya tertarik dan ingin nego button as a Logged-in User
 Given User open browser
 When User has successfully login
 And User input search product
 And User click product
 Then User should be navigated to the product page
 When User click negotiate button
 Then User should be navigated to the product popup page
 And User close browser
 
 