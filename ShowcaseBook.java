package quantom.bookstore;


public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }

    @Override
    public boolean available() {
        return false;
    }

    @Override
    public void purchase(int quantity, String email, String address) throws Exception {
        throw new Exception("Quantum book store: This book is not for sale.");
    }
}