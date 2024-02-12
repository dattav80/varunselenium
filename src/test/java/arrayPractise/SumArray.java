package arrayPractise;

public class SumArray {
    public static void main(String[] args) {
        int[] a1 = {3, 4, 5, 7};
        int i;
        int length = a1.length;
        int sum = 0;
        //for loop
        for (i = 0; i < length; i++)
            sum += a1[i];
        System.out.println("Array sum:" + sum);
        sum = 0;
        //foreach loop
        for (Integer x : a1) {
            sum = sum + x;

        }
        System.out.println("Array sum:" + sum);
    }
}
