package day8;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFile {

    public static void main(String[] args) throws IOException {

        //Users/aravindanathdm/Downloads/JavaSelenium_Sowmya/Files

        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "Demo.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String rd = reader.readLine();
        System.out.println("Reading " + rd);

    }
}
