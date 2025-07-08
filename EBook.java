package quantom.bookstore;


public class EBook extends Book {
    private String filetype;

    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    @Override
    public boolean available() {
        return true;
    }

    @Override
    public void purchase(int quantity, String email, String address) {
        System.out.println("Quantum book store: Sending '" + title + "' to " + email);
    }
}