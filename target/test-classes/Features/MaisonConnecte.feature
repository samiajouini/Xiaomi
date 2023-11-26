#Author: jouini samia
Feature: Maison Connecte

  Scenario: effectuer le tri  et cliquer sur un produit
    Given Utilisateur est sur la page  Maison Connecte
    When Utilisateur efectuer le tri par "Tri par tarif croissant" et clique sur le produit "Mi Door Window Sensor 2"
    Then Utilisateur est deriger vers la page produit  " Mi Door Window Sensor 2 "
