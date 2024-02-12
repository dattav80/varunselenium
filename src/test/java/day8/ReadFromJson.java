package day8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadFromJson {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser parse = new JSONParser();
        Object obj = parse.parse(new FileReader(System.getProperty("user.dir") + File.separator + "Files" + File.separator + "course.json"));
        JSONObject json = (JSONObject) obj;
        String name = (String) json.get("name");
        System.out.println(name);

        Object course = (Object) json.get("courses");
        System.out.println(course);

        JSONArray cr = (JSONArray) json.get("courses");
        System.out.println(cr.get(0));


    }
}
