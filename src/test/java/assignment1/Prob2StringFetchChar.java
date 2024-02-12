//Write a Java program to get the character at the given index within the String
//Author-Sowmya
package assignment1;

import java.util.Scanner;

public class Prob2StringFetchChar {
    public static void main(String[] args) {
        String s = "Java Exercises";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position to fetch character in Java Exercises");
        int i = sc.nextInt();//reads input.
        System.out.println("Character at given position" + s.charAt(i));//prints output for the given position
    }
}
