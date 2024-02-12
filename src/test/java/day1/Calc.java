package day1;

import java.util.Scanner;

public class Calc<function> {
    public static void main(String[] args) {
        float x, y;
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5.swap");
        System.out.println("Enter Option:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Number 1:");
        x = sc.nextInt();
        System.out.println("Enter Number 2:");
        y = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Result:" + (x + y));

            case 2:
                System.out.println("Result:" + (x - y));
            case 3:
                System.out.println("Result:" + (x * y));
            case 4:
                System.out.println("Result:" + (x / y));
            case 5:
                System.out.println("Numbers before swap: Number 1=" + x + "Number 2=" + y);
                x = x + y;
                y = x - y;
                x = x - y;

                System.out.println("Numbers after swap: Number 1=" + x + "Number 2=" + y);

        }

    }

}

