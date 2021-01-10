Feature: As a user I want to be able to search by User ID, Full Name, and Email
  Scenario: Search by User ID
    Given user is on the User Management page
    When enters the valid User ID "1667" into the search box
    Then the user with the valid User ID "1667" will appear in the table