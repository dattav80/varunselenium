/**
 * Write a Java program to remove duplicate characters from a given string presents in another given string.
 *
 * @author-Sowmya
 */
package assignment1;

public class Prob7removeDupAnotherStr {
    public static void main(String[] args) {
        String s1 = "the quick brown fox";
        String s2 = "queen";
        StringBuffer sb = new StringBuffer();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int l1 = s1.length();
        int l2 = s2.length();
        int i, j, x;
        for (i = 0; i < l1; i++) {
            x = 0;
            for (j = 0; j < l2; j++) {
                if (ch1[i] != ch2[j])
                    x = x + 0;
                else
                    x = x + 1;
            }
            if (x == 0)
                sb.append(ch1[i]);
        }

        System.out.println(sb);
    }
}
