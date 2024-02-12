package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample1 {

    public static void main(String[] args) {

        Set<String> name = new HashSet<String>();
        name.add("Arvind");
        name.add("Arvind");
        name.add("Arun");
        name.add("AAdvik");

        System.out.println(name.size());

        Iterator it = name.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
