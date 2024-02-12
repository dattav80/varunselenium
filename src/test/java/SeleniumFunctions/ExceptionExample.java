package SeleniumFunctions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ExceptionExample extends BaseClass {

    @Test
    public void example() {
        driver.get("https://www.indusind.com/in/en/personal.html#");
        try {
            driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.linkText("Digital Banking")).click();

    }
}
