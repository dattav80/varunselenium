package day9;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListExample5 {

    public static void main(String[] args) {

        // List<String> name = new ArrayList<String>();
        ArrayList<String> studentsName = new ArrayList<String>();
        studentsName.add("Arvind");
        studentsName.add("Varun");
        studentsName.add("Arun");
        studentsName.add(1, "Raj");

        ListIterator it = studentsName.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("++++++++++++++++ ");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }


    }
}
