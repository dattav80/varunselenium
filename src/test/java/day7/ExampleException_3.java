package day7;

public class ExampleException_3 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            int x = 0;
            int y = 20;
            int div = y / x;
            System.out.println("Div " + div);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }

        System.out.println("Ending");
    }
}
