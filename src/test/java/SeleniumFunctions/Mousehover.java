package SeleniumFunctions;

import day8.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testNg.BaseClass;

import java.util.Set;

public class Mousehover extends BaseClass {


    @Test
    public void byid() throws InterruptedException {
        driver.get("https://canarabank.com/");

        WebElement login = driver.findElement(By.xpath("//p[text()='LOGIN']"));
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(login).build().perform();

        WebElement netBanking = driver.findElement(By.xpath("//a[text()='Net Banking - Canara']"));

        String win1 = driver.getWindowHandle();
        System.out.println("Parent window  is " + win1);

        System.out.println("Page Title: " + driver.getTitle());
        Generic.click(driver, netBanking);

        Set<String> wins = driver.getWindowHandles();

        for (String win : wins) {
            driver.switchTo().window(win);
            System.out.println("Window " + win);
        }
        System.out.println("Page Title: " + driver.getTitle());
        driver.findElement(By.xpath("//button[contains(text(),'Net Banking - Retail')]")).click();

        driver.close();

        driver.switchTo().window(win1);
        Thread.sleep(2000);
        WebElement lgn = driver.findElement(By.xpath("//p[text()='LOGIN']"));


        Generic.mouseHover(driver, lgn);

        driver.findElement(By.linkText("Credit Card Portal")).click();

        System.out.println("Page Title: " + driver.getTitle());
    }
}
