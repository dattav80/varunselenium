package day5;

public class ExampleChar_3 {

    public static void main(String[] args) {

        String value = "Sowmya";
        for (Character c : value.toCharArray()) {
            if (c.toString().contains("a") | c.toString().contains("e") | c.toString().contains("i") | c.toString().contains("o") | c.toString().contains("u")) {
                System.out.println("Vowel: " + c);
            }
        }

    }
}
