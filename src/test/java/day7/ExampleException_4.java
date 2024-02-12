package day7;

public class ExampleException_4 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            String name = null;

            System.out.println(name.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Ending");
    }
}
