package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class ExmapleDemo {
    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.amazon.in");

    }
}
