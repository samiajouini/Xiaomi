package TestSuites;



import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.XiaomiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class XiaomiHomePageStepDef {
	@Given("admin is on Home Page")
	public void admin_is_on_home_page() throws IOException {
		Config.Confchrome();
		Config.navigate(Utils.getProperty("webURL"));
		Config.maximisewindow();
	}
	    
	
@When("admin mousHover on menu {string}")
public void admin_mous_hover_on_menu(String menu) throws InterruptedException {
  XiaomiPage page  = new XiaomiPage();
  Thread.sleep(3000);
	page.mouseHoverOnMenuByName(menu);  
  
}

@When("admin click on submenu {string}")
public void admin_click_on_submenu(String subMenu) throws Exception  {
	XiaomiPage  page = new XiaomiPage();
	Thread.sleep(3000);
	page.clickSubMenuPage(subMenu);
}

@Then("admin directed to the submenu page {string}")
public void admin_directed_to_the_submenu_page(String ExpectedText) {
	PageMaisonConnecte  maison = new PageMaisonConnecte();
	String actualText= maison.verifMessagemaison();
	
	Assert.assertEquals(ExpectedText, actualText);
	Config.quit();
}


}
