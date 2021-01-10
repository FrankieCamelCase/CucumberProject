Feature: As a user I want to be able to login
  Scenario: Log in as a librarian
  Given user is on the login page
  When user logs in as "Test Librarian 49"
  Then the user should see the dashboard
