import java.util.Scanner;

public class _1_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (var i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            System.out.println(number);
        }
        scanner.close();
    }
}
