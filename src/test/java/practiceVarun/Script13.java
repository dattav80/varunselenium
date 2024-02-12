package practiceVarun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Script13 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        System.out.println("first tab" +driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com");
        System.out.println("second tab"+driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.twitter.com");
        System.out.println("third tab"+driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");
        System.out.println("fourth tab"+driver.getTitle());

        //Get window handles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handles = new ArrayList<>();
        handles.addAll(windowHandles);

        driver.close();
        driver.switchTo().window(handles.get(2));
        System.out.println(driver.getTitle());








    }
}
