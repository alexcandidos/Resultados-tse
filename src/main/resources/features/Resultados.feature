#language: en

Feature: Perform app main flow

  Background:
    Given I launch the app by the first time
    When I click on "Próximo"
    And I click on "Entendi"
    And I scroll to the end
    And I click on "Li e Aceito"
    Then I am on the app home page

  Scenario: App main flow
    Given I select a location by UF "AL"
    When I select the turno "2"
    Then I see the result is completed
    Then I see there is a candidate elected

  Scenario: Add a candidate to favorite
    Given I select a location by UF "AL"
    And I select the turno "2"
    And I open one of the candidates
    When I add a to favorites
    And I return to home page
    And I click on favorite tab
    Then I see the candidate is present
