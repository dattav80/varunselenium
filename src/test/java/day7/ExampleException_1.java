package day7;

public class ExampleException_1 {

    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            int x = 2;
            int y = 20;
            int div = y / x;
            System.out.println("Div " + div);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ending");
    }
}
