#language: en

Feature: Setup flow, results and favorite features of Resultado app

  Scenario: Performs app setup flow
    Given I launch the app by the first time
    When I click on "Próximo"
    And I click on "Entendi"
    And I scroll to the end
    And I click on "Li e Aceito"
    Then I am on the app home page

  Scenario: Filter end result by state
    Given I select a location by UF "AL"
    When I select the turno "2"
    Then I see the result is completed
    And I see there is a candidate elected

  Scenario: Add a candidate to favorite
    Given I open one of the candidates
    When I add to favorites
    And I return to home page
    And I click on favorite tab
    Then I see the candidate is present