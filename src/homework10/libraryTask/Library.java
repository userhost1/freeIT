package homework10.libraryTask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static int orderNumber = 0;
    private List<Book> books = new ArrayList();

    public void add(Book book) {
        if (!books.isEmpty()) {
            for (Book b : books) {
                if (book.getId() == b.getId()) {
                    System.out.println("Book with same ID is already exist");
                    return;
                }
            }
        }
        book.setOrderNumber(++orderNumber);
        books.add(book);
    }

    public void remove(int id) {
        if (!books.isEmpty()) {
            for (Book b : books) {
                if (b.getId() == id) {
                    books.remove(b);
                    return;
                }
            }
        }
        System.out.println("Book doesn't exist with ID " + id);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void editBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                book.setOrderNumber(books.get(i).getOrderNumber());
                books.set(i, book);
                return;
            }
        }
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String s = "";
        for (Book b : books) {
            s += b.toString() + "\n";
        }
        return s;
    }
}
