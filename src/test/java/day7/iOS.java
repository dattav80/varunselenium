package day7;

public class iOS extends ServiceProvider implements Mobile, Network {

    public static void main(String[] args) {
        iOS app = new iOS();
        app.scroll();
        app.swipe();
        app.tap();
        app.fiveG();
        app.threeG();
        app.underWarranty();
    }

    public void swipe() {
        System.out.println("Swiping...");
    }

    public void scroll() {
        System.out.println("Scrolling...");
    }

    public void tap() {
        System.out.println("ioS Tapping...");
    }

    public void threeG() {

    }

    public void fiveG() {

    }
}
