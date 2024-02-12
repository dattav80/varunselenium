package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class Dropdown extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");

        WebElement lang = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
        Thread.sleep(2000);
//        Select sel = new Select(lang);
//        sel.selectByVisibleText("বাংলা");
//        Thread.sleep(2000);
//        sel.selectByValue("cy");
//        Thread.sleep(2000);
//        sel.selectByIndex(60);

        Generic.setectByVisisbleText(lang, "বাংলা");
    }
}
