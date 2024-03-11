Feature: Test Case One

	@sanity @regression
  Scenario: Web Development Test
    Given the user navigate to Coursera Home page
    When the user enter Web Development in SearchBox
    And the user click the English language checkbox
    And the user clicked Beginner level checkbox
    Then the user get the First Course Name and Click it
    And the user get the Rating and Duration of First Course
    And the user get the Second Course name and Click it
    Then the user get the Rating and Duration of Second Course
