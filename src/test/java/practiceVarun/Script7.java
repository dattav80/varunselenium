package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Script7 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//select[@id='country']"));

        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("Germany");

        List<WebElement> elem = dropdown.getOptions();
        System.out.println("Total options are:" + elem.size());

        if (dropdown.isMultiple()) {
            System.out.println("Drop down is multiple");
        } else {
            System.out.println("Drop down is non-multiple");
        }

        for (WebElement elem1 : elem) {
            System.out.println(elem1.getText());
            if (elem1.getText().equals("Brazil")) {
                elem1.click();
            }


        }
    }


}

