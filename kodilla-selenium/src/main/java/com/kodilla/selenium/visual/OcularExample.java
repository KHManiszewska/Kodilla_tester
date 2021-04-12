package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/khm/Documents/Development/Kodilla/chromedriver");        // [1]
        WebDriver webDriver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("/Users/khm/IdeaProjects/results"))
                .snapshotPath(Paths.get("/Users/khm/IdeaProjects/snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.compare();
        page.close();
    }
}
