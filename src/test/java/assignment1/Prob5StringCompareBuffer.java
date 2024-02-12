//Write a Java program to compare a given string to the specified string buffer
//Author-Sowmya
package assignment1;

import java.util.Scanner;

public class Prob5StringCompareBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("example.com");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to compare");
        String s1 = sc.next();
        String s2 = sb.toString();
        if (s1.equals(s2))
            System.out.println("both strings are same");
        else
            System.out.println("both strings are different");
    }

}
