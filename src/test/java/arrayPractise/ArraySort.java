package arrayPractise;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a1 = {23, 56, 89, 32, 90};
        String[] a2 = new String[3];
        a2[0] = "test";
        a2[1] = "Selenium";
        a2[2] = "static";
        Arrays.sort(a1);
        System.out.println("Integer array sort:" + Arrays.toString(a1));
        Arrays.sort(a2);
        System.out.println("String array sort:" + Arrays.toString(a2));

    }
}
