package day6;

public class Android extends Mobile {

    public static void main(String[] args) {
        Android and = new Android();
        and.sms();
        and.call();
        and.touchScreen();
    }

    void sms() {
        System.out.println("Android sms");
    }

    void call() {
        System.out.println("android call");
    }
}
