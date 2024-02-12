package day2;

public class StringExample1 {
    public static void main(String[] args) {
        String name = "Sowmya";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.startsWith("Sow"));
        System.out.println(name.endsWith("mya"));
        System.out.println(name.contains("my"));

        System.out.println(name.equals("Sowmya"));
        System.out.println(name.equalsIgnoreCase("sowmya"));

    }
}
