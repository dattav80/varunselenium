/**
 * Write a Java program to print after removing duplicates from a given string
 *
 * @author-Sowmya
 */

package assignment1;

public class Prob10StringRemoveDuplicate {
    public static void main(String[] args) {
        //      Scanner sc=new Scanner(System.in);
        //    System.out.println("Enter String");
        //   String s1=sc.next();//reads input.
        String s1 = "W3resource";
        StringBuffer sb = new StringBuffer();
        int i;

        for (i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int j = s1.indexOf(ch);
            if (j <= 0)
                sb.append(ch);

        }
        System.out.println("removed duplicates:" + sb);

    }
}
