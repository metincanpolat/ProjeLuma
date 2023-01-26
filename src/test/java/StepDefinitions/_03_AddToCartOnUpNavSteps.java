package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Pages.UpNav;
import io.cucumber.java.en.And;

public class _03_AddToCartOnUpNavSteps {

    UpNav un=new UpNav();
    DialogContent dc=new DialogContent();

    @And("Add to cart a product from UpNow")
    public void addToCartAProductFromUpNow() {

        un.findAndMoveToElement("men");
        un.findAndMoveToElement("top");
        un.findAndClick("jacked");
        dc.findAndContainsText("jacketTitleText","Jacket");
        dc.findAndClickList("jacketList");
        dc.findAndClickList("sizeList");
        dc.findAndClickList("colorList");
        dc.findAndClick("addToCart");

    }
}
