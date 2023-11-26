#Author: jouini samia

Feature: liste des souhaits 


  
  Scenario: Ajouter un produit a la liste des souhiats
   
    Given Utilisateur est sur la page de produit choisi  
    When  Utilisateur clique sur ajouter a la liste des souhiats 
    Then Utilisateur est deriger vers la page de la liste des souhaits et verifier que le produit est ajouter a la liste
    

  