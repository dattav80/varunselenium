//Write a Java program to get the length of a given string.
//Author-Sowmya

package assignment1;

import java.util.Scanner;

public class Prob8Stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.next();//reads input.
        System.out.println("String length: " + s1.length());//prints length
    }
}
