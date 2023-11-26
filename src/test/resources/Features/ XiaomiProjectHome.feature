#Author: jouini samia
Feature: Xiaomi Home Page

  Scenario: admin is on submenu page 
    Given admin is on Home Page
    When admin mousHover on menu "Smart Home"
    And admin click on submenu "Maison connectée"
    Then admin directed to the submenu page "Maison connectée"
