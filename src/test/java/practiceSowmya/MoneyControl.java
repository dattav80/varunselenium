package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MoneyControl extends BaseClass {
    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.moneycontrol.com/markets/global-indices/");
        System.out.println("--------Money control-------");
    }

    @Test
    public void mc() throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "Demo.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String val;
        while ((val = br.readLine()) != null) {
            WebElement price = driver.findElement(By.xpath("//table[@class='mctable1']/tbody/tr/td/p/a[@title='" + val + "']//following::td[1]"));
            String p1 = price.getText();
            System.out.println(val + ":" + p1);
        }


    }

//    @DataProvider
//    public Object[][] testdata(){
//
//        Object[][] data=new Object[0][3];
//        data[0][0]="COTTON";
//        data[0][1]="GOLD";
//        data[0][2]="SILVER";
//        return data;
//
//    }
}
