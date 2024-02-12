package day5;

public class ExampleChar_2 {

    public static void main(String[] args) {

        String value = "123Varun234";

        char ch[] = value.toCharArray();//'1'2'3'V'a'r'u'n'2'3'4'
        int sum = 0;
        for (Character c : ch) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("sum: " + sum);


    }
}
