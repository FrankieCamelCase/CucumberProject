Feature: As a user I should be able to filter user from the User Group dropdown
  Scenario: Filter users by Student
    Given user is on the User Management page
    When user selects the user group drop down
    And user selects Students
    Then only Student users will be displayed