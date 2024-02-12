package day5;

public class Books {

    public Books() {
        System.out.println("Books constructor");
    }

    public Books(String title, String author, String publisher) {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        new Books("Mobile autoamtion", "Arvind", "Demo");
        new Books();
    }

}
