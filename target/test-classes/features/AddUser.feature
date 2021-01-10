Feature: As a user I want to be able to add a user

  Scenario: Add one user
    Given user is on the User Management page
    When user clicks the add user button
    And the user enters <Full Name>, <Password>, <Address>
     | Full Name      | Sarah           |
     | Password       | 123             |
     | Email          | sarah1@sarah.com|
     | Address        | 19348 New Road  |
    And clicks the save changes button
    Then the new user information will appear in the table.
