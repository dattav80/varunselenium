package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

import java.util.List;

public class FormAutomation extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        String fn = Generic.firstName(), ln = Generic.lastname(), email = Generic.email();

        driver.findElement(By.id("firstName")).sendKeys(fn);
        driver.findElement(By.id("lastName")).sendKeys(ln);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        Thread.sleep(2000);
        WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
        male.click();
        Thread.sleep(2000);

        if (driver.findElement(By.id("gender-radio-1")).isSelected()) {
            System.out.println("Male selected");
            driver.findElement(By.xpath("//label[text()='Female']")).click();
            System.out.println("Female selected");
        } else {
            male.click();
        }

        driver.findElement(By.id("userNumber")).sendKeys(Generic.mobileNumber());

        driver.findElement(By.id("dateOfBirthInput")).click();

        WebElement month = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        WebElement year = driver.findElement(By.cssSelector(".react-datepicker__year-select"));

        Generic.setectByValue(month, "4");
        Generic.setectByINdex(year, 30);

        List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));

        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase("30")) {
                date.click();
                break;
            }
        }

        Thread.sleep(3000);

        List<WebElement> cb = driver.findElements(By.xpath("(//div[@class='col-md-9 col-sm-12'])[6]/div/label"));
        System.out.println("Check Box " + cb.size());
        for (WebElement cbox : cb) {
            System.out.println(cbox.getText());
            cbox.click();
        }

    }

}
