@RegistrationSteps2
Feature: Registration feature test
  Background:
    Given I open web https://online.depo.lv/

  Scenario:
    Given Shop Selector is visible
    When I select shop
    Given Depo logo is visible
    And I press ieietVaiRegistreties button
    And I press Registreties button
    And I fill form
    And I confirm registration
    Then I check that registration is completed
    And I close browser

