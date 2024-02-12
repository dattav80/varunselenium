package day5;

import java.util.Scanner;

public class ExampleUserInput {

    public static void main(String[] args) {


        System.out.println("THis is output Stream");

        System.err.println("This is an error stream");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();
        System.out.println("Enter the roll number");
        int roll = scanner.nextInt();
        System.out.println("Enter the Weight");
        float weight = scanner.nextFloat();

        System.out.println("I am " + name + " and roll number is " + roll + " my weight is " + weight);


    }
}
