/**
 * Write a program in Java to input 5 numbers from keyboard and find their sum and average.
 *
 * @author-Sowmya
 */
package assignment2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int i, j, x = 0;
        for (i = 0; i < 5; i++) {

            j = sc.nextInt();
            x = x + j;
        }
        System.out.println("Sum:" + x);
        System.out.println(("Average:" + (x / 5)));
    }
}
