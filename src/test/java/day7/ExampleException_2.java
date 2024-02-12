package day7;

public class ExampleException_2 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            int x = 0;
            int y = 20;
            int div = y / x;
            System.out.println("Div " + div);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Ending");
    }
}
