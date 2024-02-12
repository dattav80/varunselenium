package day4;

public class Calculator {


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber(10, 20);
        cal.substaraction(44, 20);
        int x = cal.addNumber(10, 20, 30);
        System.out.println("x: " + x);
        multiple(2, 3, 4);


    }

    public static void multiple(int x, int y, int z) {
        int mul = x * y * z;
        System.out.println("mul = " + mul);
    }

    // This is method
    public void addNumber(int x, int y) {
        int sum = x + y;
        System.out.println("sum = " + sum);
    }

    // This is method overloading
    public int addNumber(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    public void substaraction(int x, int y) {
        int sub = x - y;
        System.out.println("sub = " + sub);
    }
}
