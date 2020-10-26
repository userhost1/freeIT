package homework10.library;

import java.util.*;

public class LibraryRunner {
    public static void main(String[] args) {

        Library library = new Library();

        library.add(new Book(1, "Мастер и Маргарита", "Фантастика"));
        library.add(new Book(4, "Жизнь в займы", "Роман"));
        library.add(new Book(3, "Шагреневая кожа", "Фантастика"));
        library.add(new Book(2, "Горе от ума", "Комедия"));
        library.add(new Book(5, "Неудобство культуры", "Психология"));

        System.out.println(library.toString());

        List<Book> list = library.getBooks();
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        library.setBooks(list);
        System.out.println("After sorting by title:\n" + library.toString());

        library.remove(1);
        System.out.println("After removing:\n" + library.toString());

        list = library.getBooks();
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getOrderNumber() - o1.getOrderNumber();
            }
        });
        library.setBooks(list);
        System.out.println("After sorting by Order number:\n" + library.toString());

        library.editBook(new Book(5, "Остроумие и отношение его к безсознательному", "Психология"));
        System.out.println("After editing:\n" + library.toString());

        library.add(new Book(1, "Норвежский лес", "Роман"));
        System.out.println("After adding:\n" + library.toString());

        library.add(new Book(1, "Норвежский лес", "Роман"));

        library.remove(7);



    }
}
