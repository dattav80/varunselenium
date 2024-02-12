package day9;

import java.util.ArrayList;

public class ListExample3 {

    public static void main(String[] args) {

        // List<String> name = new ArrayList<String>();
        ArrayList<String> studentsName = new ArrayList<String>();
        studentsName.add("Arvind");
        studentsName.add("Varun");
        studentsName.add("Arun");
        studentsName.add(1, "Raj");

        System.out.println(studentsName.size());

        for (int i = 0; i < studentsName.size(); i++) {
            System.out.println(studentsName.get(i));
        }


    }
}
