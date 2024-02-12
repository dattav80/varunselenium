package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Script9 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.id("how-select"));

        //Using select class for dropdown
        Select dropdown = new Select(element);
        dropdown.selectByIndex(3);
        dropdown.selectByVisibleText("Internet");
        dropdown.selectByValue("Other");

        //List the options
        List<WebElement> elem1 = dropdown.getOptions();

        //Get the Options size
        System.out.println("The number of options available are:" + elem1.size());

        //Get the text options
        for (WebElement elems : elem1) {
            System.out.println("The options available are: " + elems.getText());
            if(elems.getText().equals("Previously Used")){
                elems.click();
                break;
            }
        }

        List originalList = new ArrayList<>();
        for (WebElement elems : elem1) {
            originalList.add(elems.getText());
        }
        System.out.println(originalList);

        Collections.sort(originalList);
        System.out.println("Sorted Original List is:" + originalList);

        List tempList = new ArrayList<>();
        for (WebElement elems : elem1) {
            tempList.add(elems.getText());
        }
        System.out.println(tempList);
        Collections.sort(tempList);
        System.out.println("Sorted Temp List is:" + tempList);

        if (originalList == tempList) {
            System.out.println("List is sorted");
        } else {
            System.out.println("List is not sorted");
        }





    }


}

