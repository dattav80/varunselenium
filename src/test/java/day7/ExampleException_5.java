package day7;


public class ExampleException_5 {

    public static void main(String[] args) {

        try {
            System.out.println("ExampleException_5");
            int i = 10;
            int j = 0;
            int x = i / j;


        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Done!");
        }

    }
}
