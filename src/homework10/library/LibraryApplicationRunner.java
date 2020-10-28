package homework10.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;

public class LibraryApplicationRunner {

    private static Library library;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        library = new Library();

        library.add(new Book(1, "Мастер и Маргарита", "Фантастика"));
        library.add(new Book(4, "Жизнь в займы", "Роман"));
        library.add(new Book(2, "Шагреневая кожа", "Фантастика"));
        library.add(new Book(3, "Горе от ума", "Комедия"));
        library.add(new Book(5, "Неудобство культуры", "Психология"));

        start();
    }

    public static void start() throws IOException {

        System.out.println("  Гдавное меню");
        System.out.println("1 вывод списка всех книг.");
        System.out.println("2 добавление книги.");
        System.out.println("3 удаление книги.");
        System.out.println("4 редактирование книги.");
        System.out.println("5 Выход");

        switch (input()) {
            case 1:
                getBooks();
                break;
            case 2:
                addBook();
                break;
            case 3:
                remove();
                break;
            case 4:
                editBook();
                break;
            case 5:
//                System.out.println("Работа c приложением завершена. Спасибо!");
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                closeApplication();
                break;
            default:
                System.out.println("Некорректный ввод! Пожалуйста, попробуйте снова.");
                start();
        }
    }

    public static void getBooks() throws IOException {

        System.out.println("    1 по алфавиту (возрастание)" +
                "\n    2 по алфавиту (убывание)" +
                "\n    3 по добавлению" +
                "\n    4 возврат в главное меню" +
                "\n    5 выход");

        List<Book> list;

        switch (input()) {
            case 1:
                list = library.getBooks();
                list.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                });
                library.setBooks(list);
                System.out.println(library.toString());
                break;

            case 2:
                list = library.getBooks();
                list.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o2.getTitle().compareTo(o1.getTitle());
                    }
                });
                library.setBooks(list);
                System.out.println(library.toString());
                break;

            case 3:
                list = library.getBooks();
                list.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getOrderNumber() - o2.getOrderNumber();
                    }
                });
                library.setBooks(list);
                System.out.println(library.toString());
                break;

            case 4:
                start();
                break;

            case 5:
//                System.out.println("Работа c приложением завершена. Спасибо!");
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                closeApplication();
                break;
            default:
                System.out.println("Некорректный ввод! Пожалуйста. попробуйте снова.");
                getBooks();
        }
        doContinue();
    }

    public static void addBook() throws IOException {

        System.out.println("    введите пожалуйста ID ");
        int id = input();
        while (id <= 0) {
            System.out.println("    введите пожалуйста ID ");
            id = input();
        }

        System.out.println("    введите пожалуйста название ");
        String title = in.readLine();

        System.out.println("    введите пожалуйста жанр ");
        String genre = in.readLine();

        library.add(new Book(id, title, genre));

        doContinue();
    }

    public static void remove() throws IOException {

        System.out.println("    введите пожалуйста ID ");
        int id = input();
        while (id <= 0) {
            System.out.println("    введите пожалуйста ID ");
            id = input();
        }

        library.remove(id);

        doContinue();
    }

    public static void editBook() throws IOException {

        System.out.println("    введите пожалуйста ID ");
        int id = input();
        while (id <= 0) {
            System.out.println("    введите пожалуйста ID ");
            id = input();
        }

        System.out.println("    введите пожалуйста название");
        String title = in.readLine();

        System.out.println("    введите пожалуйста жанр");
        String genre = in.readLine();

        library.editBook(new Book(id, title, genre));

        doContinue();
    }

    private static int input() throws IOException {
        String num = in.readLine();
        if (isNumber(num)) {
            return Integer.parseInt(num);
        }
        return -1;
    }

    private static boolean isNumber(String o) {
        try {
            int i = Integer.parseInt(o);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void doContinue() throws IOException {
        System.out.println("Желаете продолжить работу с приложением?" +
                "\n 1 - да" +
                "\n 2 - нет");

        switch (input()) {
            case 1:
                start();
                break;
            case 2:
//                System.out.println("Работа c приложением завершена. Спасибо!");
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                closeApplication();
                break;
            default:
                System.out.println("Некорректный ввод! Пожалуйста. попробуйте снова.");
                doContinue();
        }
    }

    public static void closeApplication() {
        System.out.println("Работа c приложением завершена. Спасибо!");
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
