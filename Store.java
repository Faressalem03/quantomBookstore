package quantom.bookstore;

import java.util.*;

public class Store {
    private Map<String, Book> books = new HashMap<>();

    public void add(Book b) {
        books.put(b.getIsbn(), b);
        System.out.println("Quantum book store: Added '" + b.getTitle() + "'");
    }

    public void removeOld(int currentYear, int maxAge) {
        books.values().removeIf(b -> currentYear - b.getYear() > maxAge);
        System.out.println("Quantum book store: Removed old books.");
    }

    public double buy(String isbn, int quantity, String email, String address) throws Exception {
        Book b = books.get(isbn);
        if (b == null) throw new Exception("Quantum book store: Book not found.");
        b.purchase(quantity, email, address);
        return b.getPrice() * quantity;
    }
}