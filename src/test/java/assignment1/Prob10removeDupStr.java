/**
 * Write a Java program to print after removing duplicates from a given string
 *
 * @author-Sowmya
 */
package assignment1;

public class Prob10removeDupStr {
    public static void main(String[] args) {
        String s1 = "w3resource";
        StringBuffer sb = new StringBuffer();
        char[] ch1 = s1.toCharArray();
        //char[] ch2;
        int l1 = s1.length();
        int i, j, x;
        for (i = 0; i < l1; i++) {
            x = 0;
            for (j = 0; (j < l1 & i != j); j++) {
                if (ch1[i] != ch1[j])
                    x = x + 0;
                else
                    x = x + 1;
            }
            if (x == 0) {
                if (sb.indexOf(String.valueOf(ch1[i])) < 0)
                    sb.append(ch1[i]);
                //System.out.println(ch1[i]);
            }

        }

        System.out.println("String after removing duplicates: " + sb);
    }
}
