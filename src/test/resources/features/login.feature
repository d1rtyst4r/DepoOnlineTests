@RegistrationSteps
Feature: Login feature test
  Background:
    Given I open web https://online.depo.lv/

  Scenario:
    Given Shop Selector is visible
    When I select shop
    Given Depo logo is visible
    And I press ieietVaiRegistreties button
    Then I close browser

