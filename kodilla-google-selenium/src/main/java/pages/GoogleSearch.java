package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title=\"Search\"]")
    static WebElement inputField;

    @FindBy(css = "input[value=\"Google Search\"]")
    static List<WebElement> searchButton;

    private GoogleResults googleResults;                      // [1]
    private GoogleItem googleItem;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {

        PageFactory.initElements(driver, GoogleSearch.class);

        inputField.sendKeys("Kodilla");

        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        googleItem = googleResults.clickRandomItem(driver);
        googleItem.iSeeItem();
    }

    private GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(1))); // .click();
        searchButton.get(1).submit();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

//     public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/khm/Documents/Development/Kodilla/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        driver.navigate().to("http://www.google.com");
//        PageFactory.initElements(driver, GoogleSearch.class);
//        inputField.sendKeys("Kodilla");
//        googleResults = loadResults(driver);                          // [2]
//        googleResults.iSeeResults();                                  // [3]
//        driver.close();
//    }

//     public static GoogleResults loadResults(WebDriver driver) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(1)));
//        System.out.println(searchButton.size() + " **** " + searchButton.get(1).toString());
//        searchButton.get(1).submit();
//        GoogleResults googleResults = new GoogleResults(driver);
//        return googleResults;
//    }

}