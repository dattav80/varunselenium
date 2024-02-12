package day6;

public class iOS extends Mobile {
    public static void main(String[] args) {
        iOS ios = new iOS();
        ios.sms();
        ios.call();
        ios.touchScreen();
    }

    void sms() {
        System.out.println("ios sms");
    }

    void call() {
        System.out.println("ios call");
    }
}
