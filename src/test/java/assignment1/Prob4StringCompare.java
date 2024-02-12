//Write a Java program to test if a given string contains the specified sequence of char values
//Author-Sowmya

package assignment1;

import java.util.Scanner;

public class Prob4StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1 = sc.next();
        System.out.println("Enter String 1");
        String s2 = sc.next();
        if (s1.equals(s2))
            System.out.println("both strings are same");
        else
            System.out.println("both strings are different");
    }

}
