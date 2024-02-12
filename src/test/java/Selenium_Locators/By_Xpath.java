package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testNg.BaseClass;


public class By_Xpath extends ByClass{

    public void byid(){
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']")).click();


    }


}
