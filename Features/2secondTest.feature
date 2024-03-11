Feature: Test Case Two

	@sanity @regression
  Scenario: Language Learning Test
    Given the user is on the Web Development page

    When the user set Language Learning in Searchbox
    When the user click the ShowMore in languages
    Then the user get total No of Language and Verify
    And the user get total no of Levels and Verify
