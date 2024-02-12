package practiceSowmya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class MoneyControl_array extends BaseClass {
    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.moneycontrol.com/markets/global-indices/");
        System.out.println("--------Money control-------");
    }

    @Test
    public void mc() throws IOException {


        String[] data = {"GOLD", "SILVER", "COTTON"};

        for (String com : data) {
            WebElement price = driver.findElement(By.xpath("//table[@class='mctable1']/tbody/tr/td/p/a[@title='" + com + "']//following::td[1]"));
            System.out.println(com + ":" + price.getText());
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
