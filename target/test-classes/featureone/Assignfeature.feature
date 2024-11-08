Feature: Digival User

@Login
Scenario: Successful login

    Given user should navigate to application
    Given user enter username as "sf61@mail.com"
    And user enter password as "12345678"
    When user click the submit button
    Then loginShouldBeSuccess
    Then click on Digiclass
    And click on Survey
    And click on Survey Management
    Then click on Survey bank
    And click on Survey Templates
    And click on Course Level
    Then click on CreateSurvey
    And click on CreateTemplate
    And enter Survey Title as "Survey Automation"
    And enter Description as "Testing"
    Then click on Survey Level
    And click on Survey type selection
    And click on Survey type
    Then select Learning Outcome
    And select Mapping Outcome
    And click on start Creation
    Then click on Add Question
    And duplicate the Question
    And require the question
    Then delete the Question
    Then click on Add New Question
    And click on Long text
    And click on Create Runner step Template Survey