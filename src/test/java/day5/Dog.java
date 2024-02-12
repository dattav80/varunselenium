package day5;

// Sub class / Child class / derived classes --> Parent class/ Super class/ Base class
public class Dog extends Animal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fur();
        dog.tail();
        dog.bark();
        dog.vaccination();
    }

    public void bark() {
        System.out.println("Barking");
    }
}
