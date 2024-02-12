package day7;

import java.util.Scanner;

public class CustomException {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x < 100) {
            throw new Exception("Enter onyl 100 mutiples");
        } else if (x >= 100) {
            System.out.println("Please collect the cash");
        }
        System.out.println("Please   collect the cash");
    }
}
