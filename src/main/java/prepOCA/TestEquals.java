package prepOCA;

import java.time.LocalDate;

public class TestEquals {
    public static void main(String args[]) {
        Book b1 = new Book("1234-4657");
        Book b2 = new Book("1234-4657");
        LocalDate release = null;
        release = b1.equals(b2) ? b1 == b2? LocalDate.of(2050,12,12):
                LocalDate.parse("2072-02-01"):LocalDate.parse("9999-09-09");
        System.out.print(release);
    }
}