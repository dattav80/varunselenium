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

public class FollowPreeced extends BaseClass {
    @BeforeMethod
    public void launchURL() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println(driver.getTitle());
    }

    @Test
    public void fp() throws IOException {
        List<WebElement> l1 = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "links.txt";
        BufferedWriter br = new BufferedWriter(new FileWriter(path));

        for (int i = 1; i <= l1.size(); i++) {
            WebElement n1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[2]"));
            String first = n1.getText();
            WebElement n2 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[2]//following::td[1]"));
            String email = n2.getText();
            WebElement n3 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[2]//preceding::td[1]"));
            String last = n3.getText();
            br.write(first + " " + last + " " + email);
            br.newLine();
        }
        br.flush();
        br.close();

    }
}
