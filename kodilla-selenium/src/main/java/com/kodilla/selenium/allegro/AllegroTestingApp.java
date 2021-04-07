package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/khm/Documents/Development/Kodilla/chromedriver");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[1]")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialog-content")));

        // Alert alert = driver.switchTo().alert();
        // alert.accept();

        WebElement categoryCombo = driver.findElement(By.xpath("//select[1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        // driver.navigate().to("https://allegro.pl/dzial/elektronika");

        WebElement inputField = driver.findElement(By.xpath("//input[1]")); // [4]
        inputField.sendKeys("Mavic mini");

        // WebElement inputFieldButton = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/div/button"));
        // inputFieldButton.submit();
    }
}
