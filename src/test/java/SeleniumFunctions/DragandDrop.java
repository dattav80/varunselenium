package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class DragandDrop extends BaseClass {


    @Test
    public void byid() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement element1 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']/a)[1]"));
        WebElement element2 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));

        Generic.dragANDdrop(driver, element1, element2);
    }
}
