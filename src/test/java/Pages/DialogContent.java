package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "Sign In")
    private WebElement signIn;

    @FindBy(id = "email")
    private WebElement username;

    @FindBy(css = "[title='Password']")
    private WebElement password;

    @FindBy(css = "[class='action login primary']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[@class='logged-in'])[1]")
    private WebElement welcomeMessage;

    @FindBy(xpath = "(//div[@class='message-error error message'])/div")
    private WebElement errorMessage;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[6]")
    private WebElement bagAddToCart;

    @FindBy(css = "[class='message-success success message']>div")
    private WebElement successMessage;

    @FindBy(linkText = "Push It Messenger Bag")
    private WebElement bagLink;

    @FindBy(linkText = "shopping cart")
    private WebElement shoppingCart;

    @FindBy(css = "[data-role='proceed-to-checkout']")
    private WebElement checkout;

    @FindBy(css = "[class='product-image-wrapper']>img")
    private List<WebElement> shoppingCartList;

    @FindBy(name = "ko_unique_1")
    private WebElement zeroShipping;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//span[text()='Place Order']")
    private WebElement placeOrder;

    @FindBy(css = "[id='shipping-save-in-address-book']")
    private WebElement orderSummeryTab;

    @FindBy(css = "span[class='base']")
    private WebElement thankYouMessage;

    @FindBy(css = "[class='products list items product-items']>li")
    private List<WebElement> jacketList;

    @FindBy(css = "[id='page-title-heading']>span")
    private WebElement jacketTitleText;

    @FindBy(css = "[class='swatch-attribute size']>div>div")
    private List<WebElement> sizeList;

    @FindBy(css = "[class='swatch-attribute color']>div>div")
    private List<WebElement> colorList;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    private WebElement addToCart;


    WebElement myElement;
    List<WebElement> myElements;
    String productTitle;

    public void findAndSend(String strElement,String value)
    {
        //element get : burada string isimden webelemente ulaşacağım
        switch (strElement)
        {
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;


        }
        sendKeysFunction(myElement,value);

    }
    public void findAndClick(String strElement)
    {
        //element get : burada string isimden webelemente ulaşacağım
        switch (strElement)
        {
            case "signIn" : myElement=signIn;break;
            case "loginButton" : myElement=loginButton;break;
            case "bagAddToCart" : myElement=bagAddToCart;break;
            case "shoppingCart" : myElement=shoppingCart;break;
            case "checkout" : myElement=checkout;break;
            case "zeroShipping" : myElement=zeroShipping;break;
            case "nextButton" : myElement=nextButton;break;
            case "placeOrder" : myElement=placeOrder;break;
            case "orderSummeryTab" : myElement=orderSummeryTab;break;
            case "addToCart" : myElement=addToCart;break;


        }


        clickFunction(myElement);
        if (myElement==bagAddToCart){
            waitAWhile.until(ExpectedConditions.visibilityOf(bagLink));
            productTitle=bagLink.getAttribute("title");}


    }
    public void findAndContainsText(String strElement, String text)
    {

        switch (strElement)
        {
            case "welcomeMessage" : myElement=welcomeMessage;break;
            case "errorMessage" : myElement=errorMessage;break;
            case "successMessage" : myElement=successMessage;break;
            case "thankYouMessage" : myElement=thankYouMessage;break;
            case "jacketTitleText" : myElement=jacketTitleText;break;

        }

        verifyContainsTextFunction(myElement,text);

    }
    public void findAndContainsList(String strElement)
    {

        switch (strElement)
        {
            case "shoppingCartList" : myElements=shoppingCartList;break;

        }

        checkTheList(myElements,productTitle);

    }
    public void findAndClickList(String strElement)
    {

        switch (strElement)
        {
            case "jacketList" : myElements=jacketList;break;
            case "sizeList" : myElements=sizeList;break;
            case "colorList" : myElements=colorList;break;

        }

        randomClickTheList(myElements);

    }
    public void findAndMoveToElement(String strElement)
    {
        switch (strElement)
        {
            case "bagLink" : myElement=bagLink;break;

        }

        moveToElement(myElement);

    }
//    public void findAndDelete(String searchText)
//    {
//
//        findAndSend("nameSearch",searchText);
//        findAndClick("searchButton");
//        waitUntilLoading();
//        findAndContainsText("searchResultCell",searchText);
//        findAndClick("deleteIcon");
//        findAndClick("deleteButton");
//
//
//    }






}
