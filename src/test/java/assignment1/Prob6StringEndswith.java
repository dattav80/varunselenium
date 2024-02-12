//Write a Java program to check whether a given string ends with the contents of another string
//Author-Sowmya
package assignment1;

import java.util.Scanner;

public class Prob6StringEndswith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.next();//reads input.
        System.out.println(s1.endsWith("se"));
        if (s1.endsWith("se"))
            System.out.println("String ends with se");
        else
            System.out.println("String does not ends with se");

    }
}
