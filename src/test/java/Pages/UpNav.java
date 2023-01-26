package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UpNav extends Parent{

    public UpNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Men']")
    private WebElement men;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    private WebElement top;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    private WebElement jacked;


    WebElement myElement;

    public void findAndMoveToElement(String strElement)
    {
        switch (strElement)
        {
            case "men" : myElement=men;break;
            case "top" : myElement=top;break;

        }

        moveToElement(myElement);

    }

    public void findAndClick(String strElement)
    {
        //element get : burada string isimden webelemente ulaşacağım
        switch (strElement)
        {
            case "jacked" : myElement=jacked;break;


        }

        clickFunction(myElement);

//        if (myElement==bagAddToCart){
//            waitAWhile.until(ExpectedConditions.visibilityOf(bagLink));
//            productTitle=bagLink.getAttribute("title");}


    }


}
