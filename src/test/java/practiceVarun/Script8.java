package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Script8 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("country"));
        Select sel1 = new Select(element);

        List originalList = new ArrayList<>();
        List tempList = new ArrayList();

        List<WebElement> options = sel1.getOptions();

        for (WebElement elem1 : options) {
            originalList.add(elem1.getText());
            tempList.add(elem1.getText());
        }

        System.out.println("Original List is: " + originalList);
        System.out.println("Before sorting Temp List is: " + tempList);

        Collections.sort(tempList);

        System.out.println("After sorting original list is: " + originalList);
        System.out.println("After sorting temp list is: " + tempList);


        if (originalList == tempList) {
            System.out.println("Dropdown is sorted");
        }
            else{
                System.out.println("Dropdown is not sorted");
            }
        }
    }

