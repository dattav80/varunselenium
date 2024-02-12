package day2;

public class StringExample5 {
    public static void main(String[] args) {
        String name = "Sowmya_1343";

        for (String str : name.split("_")) {
            if (str.matches("\\d{6}")) {
                System.out.println(str);
            } else if (str.matches("\\d{4}")) {
                System.out.println(str);
            }

        }

    }
}
