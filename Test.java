package quantom.bookstore;


public class Test {
    public static void main(String[] args) {
        Store s = new Store();

        s.add(new PaperBook("111", "Java 101", 2021, 120, "Fares mohamed", 4));
        s.add(new EBook("222", "ML Guide", 2023, 90, "eslam mohamed", "pdf"));
        s.add(new ShowcaseBook("333", "Ancient Scripts", 1980, 0, "Unknown"));

        try {
            double paid = s.buy("111", 2, "a@a.com", "Giza");
            System.out.println("Quantum book store: Paid " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            s.buy("222", 1, "b@b.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            s.buy("333", 1, "c@c.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        s.removeOld(2025, 20);
    }
}