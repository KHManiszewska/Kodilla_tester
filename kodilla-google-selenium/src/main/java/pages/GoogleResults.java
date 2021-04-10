package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public GoogleItem clickRandomItem(WebDriver driver) {

        int itemNumber = pickUpItemNumber();
        String urlItem = results.get(itemNumber).findElement(By.tagName("a")).getAttribute("href");
        String pageTitle = results.get(itemNumber).findElement(By.tagName("h3")).getText();

        System.out.println("*********************");
        System.out.println("losowo wybrana strona - "+pageTitle+"; "+urlItem);

        driver.navigate().to(urlItem);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains(urlItem));
        GoogleItem googleItem = new GoogleItem(driver);
        return googleItem;
    }

    public int pickUpItemNumber() {
        Random random = new Random();
        int itemNumber = random.nextInt(results.size()-1);
        return itemNumber;
    }
}
