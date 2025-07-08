package quantom.bookstore;

public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public abstract boolean available();
    public abstract void purchase(int quantity, String email, String address) throws Exception;

    public String getIsbn() { return isbn; }
    public int getYear() { return year; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
}