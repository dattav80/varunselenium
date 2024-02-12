package day9;

import java.util.Arrays;
import java.util.Collections;

public class ExampleArray4 {

    public static void main(String[] args) {


        String[] names = new String[4];
        names[0] = "Arvind";
        names[1] = "Teju";
        names[2] = "Aadvik";
        names[3] = "Jakarta";


        Arrays.sort(names, Collections.reverseOrder());


        for (String str : names) {
            System.out.println(str);
        }


    }
}
