Feature:  As a user I should be able to filter users' status from the STATUS dropdown
  Scenario: Filter users by active users
    Given user is on the User Management page
    When user selects the STATUS drop down
    And user selects Inactive
    Then only Inactive users will be displayed