Feature: Complete information on the entrepreneurs page

  In order to do have a great user experience,
  the user should be able to go to the entrepreneurs page
  and complete the user information for the newsletter on the
  entrepreneurs page

  @webTesting
  Scenario: Write down user information for the newsletter on the entrepreneurs page
    Given the user navigates the Cube Ventures home page
    When the user checks the options on the upper section of the page
    And the user navigates to the entrepreneurs page
    And the user writes down the user information for the newsletter
    Then the subscribe button should be visible
