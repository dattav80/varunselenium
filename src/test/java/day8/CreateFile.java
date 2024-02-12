package day8;


import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        //Users/aravindanathdm/Downloads/JavaSelenium_Sowmya/Files

        String path = System.getProperty("user.dir") + File.separator + "Files" + File.separator + "Demo.txt";
        File file = new File(path);
        file.createNewFile();

    }
}
