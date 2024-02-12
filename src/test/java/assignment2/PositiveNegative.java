/**
 * Write a Java program to get a number from the user and print whether it is positive or negative
 *
 * @author-Sowmya
 */
package assignment2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int s1 = sc.nextInt();
        if (s1 < 0)
            System.out.println("Entered number is negative");
        else if (s1 > 0)
            System.out.println("Entered number is Positive");
        else
            System.out.println("Entered number is Zero");
    }
}
