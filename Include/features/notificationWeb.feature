@Website @Notification @Regression
Feature: Notification

  @TC.Notif.001
  Scenario: User as A Seller Verify that a red mark appears when there is a new notification about user successfully publishes product
  Given User as A seller success login
  When User as A seller success Add Product 
  And User as A seller click notif button
  Then User as A seller verify redmark notification appear
  And User as A seller verify product successfully published
  And User as A seller verify product description
  And User as A seller verify date and time product published
  
  @TC.Notif.002
  Scenario: User as A Seller Verify that a red mark appears when there is a new notification about buyer successfully offer the product
  Given User as A buyer success login
  When User as A buyer search product 
  And User as A buyer select product
  And User as A buyer offer product
  And User as A buyer logout
  And User as A seller success login again
  And User as A seller click notif button
  Then User as A seller verify new product offer notification
  And User as A seller verify product description
  And User as A seller verify date and time product offer
  
  
  @TC.Notif.003
  Scenario: Verify that a red mark disappears when there is anotification was oppened
  Given User success login
  When User click notif button
  And User click latest notification which has not been opened
  Then User verify red mark in notification bell is disappear
  
  
  @TC.Notif.004
  Scenario: User want to open all list notifications in list notification page
  Given User success login
  When User click notif button
  And User scroll down to list notification button
  And User click list notification button
  Then User verify list notification page
  
  
  @TC.Notif.005
  Scenario: User as A seller want to accept an product offer by buyer in notification page
  Given User as A seller success login
  When User as A seller success Add Product
  And User as A seller click notif button to clear redmark
  And User as A seller logout
  And User as A buyer success login again
  And User as A buyer search product
  And User as A buyer select product
  And User as A buyer offer product
  And User as A buyer logout
  And User as A seller success login again
  And User as A seller open notification bell
  And User as A seller scroll down to list notification button
  And User as A seller click list notification button
  And User as A seller click Product Offer In List Notification Page
  And Click accept Product Offer
  Then Verify product offer accepted
  
  @TC.Notif.006
  Scenario: User as A seller want to reject an offer from a buyer in notification page
  Given User as A seller success login
  When User as A seller success Add Product
  And User as A seller click notif button to clear redmark
  And User as A seller logout
  And User as A buyer success login again
  And User as A buyer search product
  And User as A buyer select product
  And User as A buyer offer product
  And User as A buyer logout
  And User as A seller success login again
  And User as A seller open notification bell
  And User as A seller scroll down to list notification button
  And User as A seller click list notification button
  And User as A seller click Product Offer In List Notification Page
  And Click reject Product Offer
  Then Verify product offer rejected
  
  @TC.Notif.007
  Scenario: User As Seller want to cancel an offer from a buyer in notification page
  Given User as A buyer success login
  When User as A buyer search product
  And User as A buyer select product
  And User as A buyer offer product
  And User as A buyer logout
  And User as A seller success login again
  And User as A seller click notif button
  And User scroll down to list notification button
  And User click list notification button
  And User click Product Offer In List Notification Page
  And Click accept Product Offer
  And Click status button
  And Click radio button cancel product transaction
  And Click button send
  Then Verify teks penjualan dibatalkan
  
  @TC.Notif.008
  Scenario: User As Seller want to change the status to Berhasil terjual
  Given User as A buyer success login
  When User as A buyer search product
  And User as A buyer select product
  And User as A buyer offer product
  And User as A buyer logout
  And User as A seller success login again
  And User as A seller click notif button
  And User scroll down to list notification button
  And User click list notification button
  And User click Product Offer In List Notification Page
  And Click accept Product Offer
  And Click status button
  And Click radio button Berhasil terjual
  And Click button send
  Then Verify teks Berhasil terjual
  
  

  
