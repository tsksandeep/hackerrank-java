import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Solved this in Java 8 because in Java 15, India's currency is ₹

public class _12_currency_formatter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double currency = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en", "IN");

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(currency));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(INDIA).format(currency));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(currency));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(currency));
    }
}