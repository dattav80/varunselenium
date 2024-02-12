package day10;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

    public static void main(String[] args) {

        Map<String, String> stdDetails = new HashMap<String, String>();
        stdDetails.put("name", "Arvind");
        stdDetails.put("city", "Banglore");
        System.out.println(stdDetails.get("name"));

        for (Map.Entry<String, String> ref : stdDetails.entrySet()) {
            System.out.println(ref);
        }

    }

}
