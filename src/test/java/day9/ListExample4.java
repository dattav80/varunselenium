package day9;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample4 {

    public static void main(String[] args) {

        // List<String> name = new ArrayList<String>();
        ArrayList<String> studentsName = new ArrayList<String>();
        studentsName.add("Arvind");
        studentsName.add("Varun");
        studentsName.add("Arun");
        studentsName.add(1, "Raj");

        Iterator it = studentsName.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
