Feature: Test Case Three

	@sanity @segression
  Scenario: For Enterprise Test
    Given the user is on the Home Page
    When the user click the For Enterprise link
    And the user click the What we offer link
    And the user click the Learn More option
    And the user set the FirstName and LastName
    And the user set Email Address and Phone Number
    And the user select Institute Type and set Institute Name
    And the user select Job Role and Department
    And the user select Describe and Expected Learning
    And the user select Country and State
    Then the user click submit and verify Email
