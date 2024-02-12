package day4;

public class AccessModifiers {


    public static void main(String[] args) {

        AccessModifiers modifiers = new AccessModifiers();
        modifiers.protectedMethod();
        modifiers.privateMethod();
        modifiers.publicMethod();
        modifiers.defaultMethod();
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    void defaultMethod() {
        System.out.println("default method");
    }


}
