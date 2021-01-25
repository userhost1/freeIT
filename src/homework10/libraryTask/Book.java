package homework10.libraryTask;

public class Book {

    private int id;
    private String title;
    private String genre;
    private int orderNumber;

    public Book(int id, String title, String genre) {
        setId(id);
        setTitle(title);
        setGenre(genre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int number) {
        this.orderNumber = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                '}';
    }
}
