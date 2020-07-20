@login
Feature: Login feature
  CBT-25: As a user, I should be able to login with correct credentials
  to different accounts, and dashboard should be displayed.

  Scenario: Truck Driver login scenario
    Given User is on the login page
    When User logs in as Truck Driver
    Then User should see dashboard