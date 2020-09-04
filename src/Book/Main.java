package Book;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", 243);
        Book book2 = new Book("Преступление и Наказание");
        Book book3 = new Book();
        book3.setPages(326);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
