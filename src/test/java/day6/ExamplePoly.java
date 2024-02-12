package day6;

public class ExamplePoly {

    public static void main(String[] args) {
        RBI rbi;
        rbi = new SBI();
        System.out.println("SBI Int " + rbi.getInt());
        rbi = new AxisBank();
        System.out.println("AxisBank Int " + rbi.getInt());

    }
}
