package assignment2;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1 = sc.next();
        Character[] ch = {'a', 'e', 'i', 'o', 'u'};
        String s2 = s1.toLowerCase();
        char[] ch1 = s2.toCharArray();
        int len = s1.length();
        int i, j, x = 0;
        for (i = 0; i < len; i++) {
            for (j = 0; j < ch.length; j++)
                if (ch1[i] == ch[j])
                    x++;
        }
        System.out.println("Number of vowels in string:" + x);
    }
}
