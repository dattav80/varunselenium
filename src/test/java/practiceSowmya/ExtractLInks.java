package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExtractLInks extends BaseClass {
    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.google.com");
        System.out.println("--------google opened-------");
    }

    @Test
    public void getlinks() throws IOException {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "links.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (WebElement l : links) {
            bw.write(String.valueOf(l.getAttribute("href")));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
