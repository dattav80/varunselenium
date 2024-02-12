package practiceSowmya;

public class ClassExInt2 implements ExampleInterface2 {
    public static void main(String[] args) {
        ClassExInt2 c = new ClassExInt2();
        c.int1Method();
        int i = 20;
        System.out.println(c.i);


    }

    @Override


    public void int1Method() {
        System.out.println("Printing Interface 1");
    }

    @Override
    public void int2Method() {
        System.out.println("Printing Interface 2");
    }
}