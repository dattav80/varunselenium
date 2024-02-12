package day9;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class ListExample2 {

    public static void main(String[] args) {

        // List<String> name = new ArrayList<String>();
        ArrayList<String> studentsName = new ArrayList<String>();
        studentsName.add("Arvind");
        studentsName.add("Varun");
        studentsName.add("Arun");
        studentsName.add(1, "Raj");

        System.out.println(studentsName.size());

//        Collections.reverse(studentsName);
        Collections.sort(studentsName, reverseOrder());

        for (String name : studentsName) {
            System.out.println(name);
        }


    }
}
