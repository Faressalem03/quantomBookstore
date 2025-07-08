package quantom.bookstore;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public boolean available() {
        return stock > 0;
    }

    @Override
    public void purchase(int quantity, String email, String address) throws Exception {
        if (stock < quantity) throw new Exception("Quantum book store: Not enough copies of " + title);
        stock -= quantity;
        System.out.println("Quantum book store: Shipping '" + title + "' to " + address);
    }
}