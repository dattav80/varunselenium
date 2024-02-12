package practiceVarun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Script4 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://udyamregistration.gov.in/Udyam_Login.aspx");

        List<WebElement> rdoButton = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("List of Radio Buttons are:" + rdoButton.size());


    }
}
