package day8;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadElsx_2 {


    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "data.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sh = wb.getSheet("sheet1");

        int lastRow = sh.getLastRowNum();

        for (int i = 0; i <= lastRow; i++) {
            String tc = sh.getRow(i).getCell(0).getStringCellValue();
            String name = sh.getRow(i).getCell(1).getStringCellValue();
            String city = sh.getRow(i).getCell(2).getStringCellValue();
            String pincode = sh.getRow(i).getCell(3).getStringCellValue();

            System.out.println(tc + " | " + name + " | " + city + " |  " + pincode);
        }


    }
}
