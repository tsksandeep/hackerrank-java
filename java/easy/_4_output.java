import java.util.Scanner;

public class _4_output {
    public static void main(String[] args) {
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);

        // while (scanner.hasNextLine()) {
        // String line = scanner.nextLine();
        // String[] strSplit = line.split(" ");

        // String word = strSplit[0];
        // for (var i = word.length(); i < 15; i++) {
        // word += " ";
        // }

        // String number = strSplit[1];
        // if (number.length() == 1) {
        // number = "00" + number;
        // } else if (number.length() == 2) {
        // number = "0" + number;
        // }

        // System.out.println(word + number);
        // }

        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }

        scanner.close();
        System.out.println("================================");
    }
}
