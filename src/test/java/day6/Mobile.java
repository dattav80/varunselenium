package day6;

public abstract class Mobile {
    // Non abstract methods
    public void touchScreen() {
        System.out.println("touchScreen");
    }

    //Abstract methods
    abstract void sms();

    abstract void call();
}
