
@Website @AddNewProduct @Smoke
Feature: Add New Product
  As a user, I can edit and add new product in SecondHand


 @TC.ADD.001
 Scenario: Clicking the Add button with Complete and Valid Data
 Given User open browser
 When User has successfully logged in
 And User click plus jual button
 Then User should be navigated to the add new product page
 When User input name product
 And User input price product
 And User input category product
 And User input description product
 And User input photo product
 And User click terbitkan button
 Then User successfully added product
 And User close browser
 
 @TC.ADD.002
 Scenario: Clicking the Add button with alphabet in the price field
 Given User open browser
 When User has successfully logged in
 And User click plus jual button
 Then User should be navigated to the add new product page
 When User input name product
 And User input alphabet price product
 And User input category product
 And User input description product
 And User input photo product
 And User click terbitkan button
 Then User unsuccessfully added product
 And User close browser
 
 @TC.ADD.003
 Scenario: Clicking the Add button with Alphanumeric Characters in the Description
 Given User open browser
 When User has successfully logged in
 And User click plus jual button
 Then User should be navigated to the add new product page
 When User input name product
 And User input price product
 And User input category product
 And User input alphanumeric description product
 And User input photo product
 And User click terbitkan button
 Then User successfully added product
 And User close browser