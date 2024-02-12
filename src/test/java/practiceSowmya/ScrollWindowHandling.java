package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollWindowHandling extends BaseClass {

    @BeforeMethod
    public void launch() {
        driver.get("https://www.amazon.in");
        System.out.println("-------Amazon launched--------");
    }

    @Test
    public void scrollWin() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches", Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement leather = driver.findElement(By.xpath("//span[text()= 'Leather']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", leather);
        leather.click();
        WebElement analog = driver.findElement(By.xpath("//span[text()='Analogue']"));
        js.executeScript("arguments[0].scrollIntoView();", analog);
        analog.click();
        WebElement discount = driver.findElement(By.xpath("//span[text()='50% Off or more']"));
        js.executeScript("arguments[0].scrollIntoView();", discount);
        discount.click();
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.xpath("//h2/a/span"));
        System.out.println("total links" + links.size());
        int i = 0;
        String win = null;
        for (WebElement l : links) {
            System.out.println(String.valueOf(l.getText()));
            if (i == 5) {
                l.click();
                win = driver.getWindowHandle();
            }
            i++;
        }
        //driver.switchTo().window(win);
        System.out.println(driver.getTitle());
        WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        System.out.println("Price:" + price.getText());


    }
}
