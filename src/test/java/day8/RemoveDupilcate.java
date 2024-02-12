package day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;


public class RemoveDupilcate {

    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.wikipedia.org/");

        List<WebElement> list = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

        System.out.println(list.size());

        ArrayList<String> str = new ArrayList<String>();
//        Set<String> values = new HashSet<String>();
        for (WebElement element : list) {
            str.add(element.getText());
        }
//  Use
        System.out.println("Before: " + str);
        Collections.sort(str);
        System.out.println("After: " + str);

        Set<String> values = new HashSet<String>();
        values.addAll(str);

        System.out.println(values);
    }
}
