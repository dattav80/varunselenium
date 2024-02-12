package day7;

public class FinalKeyword {

    final static String name = "Arvind";

    public static void main(String[] args) {

        String str = new String("Arvind");
        System.out.println(str.length());

        StringBuffer buffer = new StringBuffer("Arvind");
        System.out.println(buffer.append("sharma"));


    }


}
