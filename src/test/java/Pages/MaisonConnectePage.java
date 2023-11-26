package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectePage {
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/header/h1")
	WebElement  vMaison;
	@FindBy(name="orderby")
	WebElement  tri;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement>   listProducts;
	
public MaisonConnectePage() {
	PageFactory.initElements(Config.driver, this);	
}
String verifMessagemaison() {
String actualText= verifMessagemaison();
return actualText;

	
}	
public void SortTriAndClick(String Tri , String product) {
Select  select = new Select (tri);
select.selectByVisibleText(product);

for(WebElement produit : listProducts) {
	if(produit.getText().contains(product)) {
		produit.click();
	}
}

}
}

