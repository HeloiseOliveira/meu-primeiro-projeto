Feature: WebDriver University - Contact Us Page

  Scenario: Validate Sucessful Submission
    Given I acess the webdriver university contact us page
    When I enter a firts name
    And I enter a last name
    And I enter a email address
    And I enter a comment
    And I click on the submit button
    Then I should be presented with a sucessful contact us submission message
