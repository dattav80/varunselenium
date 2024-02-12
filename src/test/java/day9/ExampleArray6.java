package day9;

public class ExampleArray6 {

    public static void main(String[] args) {


        Object[] roll = new Object[5];

        roll[0] = "Arvind";
        roll[1] = 2345;
        roll[2] = 'd';
        roll[3] = 34.33f;
        roll[4] = true;

        for (Object o : roll) {
            System.out.println(o);
        }


    }
}
