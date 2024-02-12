package day10;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> name = new HashSet<String>();
        name.add("Arvind");
        name.add("Arvind");
        name.add("Arun");
        name.add("AAdvik");

        for (String str : name) {
            System.out.println(str);
        }

    }
}
