package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadFromProperties {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") +
                File.separator + "Files" + File.separator + "config.properties";
        try {
            FileInputStream in = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(in);
            String url_value = prop.getProperty("url");
            System.out.println(url_value);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }

    }
}
