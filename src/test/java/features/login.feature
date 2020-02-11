@login
Feature: Login to gmail

  @Smoke
  Scenario: As a user I login to tours
    Given I am on "http://newtours.demoaut.com/"
    When I provide username as "sandy" and password as "sandy"
    Then I should be able to login to tours
    And I close the browser

  @Smoke1
  Scenario: Select an element randomly
    Given Navigate to "https://edureka.co" Site
    When User selects an element from link

  @SmokeTest
  Scenario: Login into gmail account
    Given I am on "https://gmail.com"
    When I enter username "sandya.muchharla@gmail.com"
    And I click on next button
    Then I enter passowrd "Rajesh1496"
    And I click on next button
    And I should be logged in

  @SmokeTest1
  Scenario: Find Broken links
    Given I am on "https://gmail.com"
    When I get href links
    Then status code should be 200