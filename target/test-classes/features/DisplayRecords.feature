Feature: As a user I should be able to filter records by the required number of records from the Show records dropdown
  Scenario: Search by User ID
    Given user is on the User Management page
    When enters clicks "15" records
    Then the user will see "15" records in the table