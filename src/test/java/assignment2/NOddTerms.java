/**
 * Write a program in Java to display the n terms of odd natural number and their sum
 *
 * @author-Sowmya
 */
package assignment2;

import java.util.Scanner;

public class NOddTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int t = sc.nextInt();
        int i, x = 0, y = 0;
        for (i = 1; y < t; i++) {
            if ((i % 2) != 0) {
                y++;
                x = x + i;
                System.out.println(i);

            }


        }
        System.out.println("sum" + x);
    }
}
