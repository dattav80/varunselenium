/**
 * Write a program in Java to display the multiplication table of a given integer.
 *
 * @author-Sowmya
 */
package assignment2;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int t = sc.nextInt();
        int i;
        for (i = 1; i < 11; i++) {
            System.out.println(t + "x" + i + "=" + (t * i));

        }
    }
}
