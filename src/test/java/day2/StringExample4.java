package day2;

public class StringExample4 {
    public static void main(String[] args) {
        String name = "Sowmya_134123";

        char ch[] = name.toCharArray();//'S','o','w'

        for (Character ref : ch) {
            if (Character.isDigit(ref)) {
                System.out.print(ref);
            }
        }

    }
}
