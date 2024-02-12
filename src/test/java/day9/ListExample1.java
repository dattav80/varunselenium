package day9;

import java.util.ArrayList;

public class ListExample1 {

    public static void main(String[] args) {

        // List<String> name = new ArrayList<String>();
        ArrayList<String> studentsName = new ArrayList<String>();
        studentsName.add("Arvind");
        studentsName.add("Varun");
        studentsName.add("Arun");
        studentsName.add(1, "Raj");

        System.out.println(studentsName.get(0));

        System.out.println(studentsName);


    }
}
