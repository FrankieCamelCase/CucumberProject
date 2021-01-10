Feature: As a user I want to be able to view the User Management page
  Scenario: Access the User Management page
    Given user is on the dashboard
    When user clicks "Users"
    Then the user will see the Users page