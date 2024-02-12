package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Script10 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement elem1 = driver.findElement(By.id("oldSelectMenu"));

        Select dropdown = new Select(elem1);
        dropdown.selectByValue("9");

        List<WebElement> elem2 = dropdown.getOptions();
        System.out.println(elem2.size());

        for (WebElement elem3 : elem2) {
            System.out.println(elem3.getText());
        }

        for(WebElement elem4:elem2){
            if(elem4.getText().equals("Purple")){
                elem4.click();
                break;
            }
        }

        List originalList = new ArrayList<>();
        for(WebElement elem5:elem2){
            originalList.add(elem5.getText());
        }
        Collections.sort(originalList);
        System.out.println("Sorted Original List is: " +originalList);


    }
}
