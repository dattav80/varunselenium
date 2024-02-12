package day2;

public class StringExample2 {
    public static void main(String[] args) {
        //             0,1,2,3
        String name = "Sowmya";

        System.out.println(name.charAt(3));
        System.out.println(name.substring(3));
        System.out.println(name.substring(2, 5));
        System.out.println(name.replace("w", "W"));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
//
//        StringBuffer sb= new StringBuffer("Sowmya");
//        System.out.println(sb.reverse());


    }
}
