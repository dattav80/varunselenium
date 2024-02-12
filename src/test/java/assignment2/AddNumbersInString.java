package assignment2;

import java.util.Scanner;

public class AddNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1 = sc.next();
        char[] ch = s1.toCharArray();
        int i, x;
        x = 0;
        for (i = 0; i < s1.length(); i++) {
            if (Character.isDigit(ch[i]))
                x = x + Character.getNumericValue(ch[i]);
        }
        System.out.println("total value:" + x);
    }
}
