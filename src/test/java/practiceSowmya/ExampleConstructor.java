package practiceSowmya;

public class ExampleConstructor {
    ExampleConstructor(int x) {
        System.out.println("Constructor:" + x);
        //int x=10;
        //int y=100;
        //return x;
    }

    public static void main(String[] args) {

        ExampleConstructor e = new ExampleConstructor(10);
        int i = 2;
        i = i++;
        System.out.println(i);

    }
}
