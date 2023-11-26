package TestSuites;

import java.io.IOException;

import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnectePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class MaisonConnectePageStepDef {
	
	@Given("Utilisateur est sur la page  Maison Connecte")
	public void utilisateur_est_sur_la_page_maison_connecte() throws IOException {
	 Config.Confchrome();
	 Config.navigate(Utils.getProperty("Web_Maison"));
	 Config.maximisewindow();
	}

@When("Utilisateur efectuer le tri par {string} et clique sur le produit {string}")
public void utilisateur_efectuer_le_tri_par_et_clique_sur_le_produit(String Tri, String productName) {
    MaisonConnectePage maisonC = new  MaisonConnectePage ();
    maisonC.SortTriAndClick(Tri, productName);
    
       
}
	
	@Then("Utilisateur est deriger vers la page produit  {string}")
	public void utilisateur_est_deriger_vers_la_page_produit(String ExpectedName) {
		ProductPage	 page =new  ProductPage ();
		String actualName = page.verifproduct();
		
	
	}

}
