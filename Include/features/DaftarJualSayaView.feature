Feature: Daftar Jual Saya

@TC.DJS.001
Scenario: List all products sold by the seller
    Given I am logged in as a user/seller
    When I navigate to the Daftar Jual Saya page
    Then I should see a list of products I have sold
