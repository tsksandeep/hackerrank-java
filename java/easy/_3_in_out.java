import java.util.Scanner;

public class _3_in_out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerNum = scanner.nextInt();
        double doubleNum = scanner.nextDouble();
        scanner.nextLine(); // reads the next line char - important
        String string = scanner.nextLine();

        System.out.printf("String: %s\n", string);
        System.out.printf("Double: %s\n", Double.toString(doubleNum));
        System.out.printf("Int: %d", integerNum);

        scanner.close();
    }
}
