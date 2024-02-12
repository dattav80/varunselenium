package day3;

public class LocalGlobalVar {

    String city = "Banglaores"; // GlobalVar / Instance variable


    public static void main(String[] args) {

        LocalGlobalVar var = new LocalGlobalVar();
        var.reg("Arvind", "Selenium");

    }

    public void reg(String name, String course) {
        String university = "JNU"; // local variable
        System.out.println(name + " " + course + " " + city);
        System.out.println("university" + university);
    }

    public void reg(String name, String course, int roll) {
        System.out.println(name + " " + course + " " + city);
        //   System.out.println("university=" + university);
    }
}
