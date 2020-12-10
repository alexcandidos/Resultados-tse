#language: en

Feature: Perform app main flow

  Scenario: App main flow
    Given I launch the app by the first time
    When I click on "Próximo"
    And I click on "Entendi"
    And I scroll to the end
    And I click on "Li e Aceito"
    Then I am on the app home page
    Then I select the uf