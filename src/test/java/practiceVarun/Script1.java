package practiceVarun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Script1 {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        System.out.println("URL: " + driver.getCurrentUrl());

        driver.close();

    }

}
