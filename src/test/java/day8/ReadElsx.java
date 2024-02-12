package day8;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadElsx {


    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "data.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sh = wb.getSheet("sheet1");
        String value = sh.getRow(0).getCell(0).getStringCellValue();
        System.out.println(value);

    }
}
