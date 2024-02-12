package day3;

public class Calculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        ;

        int value = calc.addNumber(10, 20);
        System.out.println(value * 2);
        calc.addNumber(10, 20, 90);
    }

    // accessModifier returntype methodName (Parameter){}
    public int addNumber(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Method over loading
    public void addNumber(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum: " + sum);
    }


}
