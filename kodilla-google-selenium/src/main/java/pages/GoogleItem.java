package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleItem  extends AbstractPage{

    public GoogleItem(WebDriver driver) {
        super(driver);                               // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }
    public void iSeeItem() {
        String pageTitle = driver.getTitle();
        String pageUrl = driver.getCurrentUrl();
        System.out.println("kliknięta strona to - " + pageTitle + "; " + pageUrl);
        System.out.println("*********************");
    }
}
