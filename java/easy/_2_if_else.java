import java.util.Scanner;

public class _2_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Weird");
        } else if (number >= 2 && number <= 5) {
            System.out.println("Not Weird");
        } else if (number >= 6 && number <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
