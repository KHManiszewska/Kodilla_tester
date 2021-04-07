package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/khm/Documents/Development/Kodilla/chromedriver");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > form > div > input")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialog-content")));

        // Alert alert = driver.switchTo().alert();
        // alert.accept();

        // WebElement categoryCombo = driver.findElement(By.xpath("//select[1]"));
        // Select categorySelect = new Select(categoryCombo);
        // categorySelect.selectByIndex(3);

        driver.navigate().to("https://allegro.pl/dzial/elektronika");

        WebElement inputField = driver.findElement(By.cssSelector("div > form > div > input"));
        inputField.sendKeys("Mavic mini");

        // inputField.submit();

        WebElement inputFieldButton = driver.findElement(By.cssSelector("div > form > div > button"));
        inputFieldButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));
                // visibilityOfAllElementsLocatedBy(By.cssSelector("section > article")));

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));

        for (int n = 0; n < elements.size(); n++) {
            System.out.println("******************** wyświetlam element: "+n + " ********************");
            System.out.println(elements.get(n).getText());
        }
    }
}
