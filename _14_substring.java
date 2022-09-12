import java.io.IOException;
import java.util.Scanner;

public class _14_substring {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(text.substring(start, end));

        scanner.close();
    }

}
