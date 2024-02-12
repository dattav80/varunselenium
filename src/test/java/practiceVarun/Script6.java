package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Script6 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://omayo.blogspot.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("drop1"));

        Select dropdown = new Select(element);
        //dropdown.selectByVisibleText("doc 1");
        //dropdown.selectByValue("mno");
        dropdown.selectByIndex(0);

        if (dropdown.isMultiple()) {
            System.out.println("Drop down is multiple");
        } else {
            System.out.println("Drop down is not multiple");
        }

        List<WebElement> allOptions = dropdown.getOptions();
        System.out.println("Total options are: " + allOptions.size());

        for (WebElement el : allOptions) {
            System.out.println(el.getText());
        }

        for (WebElement option1 : allOptions) {
            if (option1.getText().equals("doc 3")) {
                option1.click();
                break;
            }
        }

        driver.close();


    }
}
