package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearch;


public class TestGoogle {

        WebDriver driver;

        @Before
        public void testSetup() {
            System.setProperty("webdriver.chrome.driver", "/Users/khm/Documents/Development/Kodilla/chromedriver");
            driver = new ChromeDriver();
            driver.navigate().to("http://www.google.com");
       }

        @After
        public void tearDown() {
            driver.close();                   // [1]
        }

        @Test
        public void testGooglePage() {
            GoogleSearch googleSearch = new GoogleSearch(driver);
            googleSearch.searchResults();
        }

}
