package day5;

public class Cat extends Animal {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.fur();
        cat.meow();
        cat.tail();
        cat.vaccination();
    }

    public void meow() {
        System.out.println("meow");
    }
}
