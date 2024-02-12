//Write a Java program to replace a specified character with another character
//Author-Sowmya

package assignment1;

import java.util.Scanner;

public class Prob9StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.next();//reads input.
        System.out.println("replaced string: " + s1.replace("e", "y"));

    }
}
