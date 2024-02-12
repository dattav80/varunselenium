package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testNg.BaseClass;

public class ByXpathFollowing extends BaseClass {


    @Test
    public void byid() {
        driver.get("https://www.moneycontrol.com/markets/global-indices/");
        /// array  comodity gold,cotton,silver

        String val = "adf";
        WebElement comodity = driver.findElement(By.xpath("(//table[@class='mctable1'])/tbody/tr/td/p/a[contains(text(),'" + val + "')]//following::td[1]"));

        String pice = comodity.getText();

        System.out.println("Proce: " + pice);

        /**
         * GOLD = 23452
         * Silver = 1342345
         * cotton = 223423
         */
    }
}
