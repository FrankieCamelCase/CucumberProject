Feature: As a user I should be able to edit users
  Scenario: Edit a users full name
    Given user is on the User Management page
    When user clicks the edit user button
    And user changes the full name to "Billy Mill"
    And user clicks the save changes button
    Then the updated full name "Billy Mill" will appear in the records table