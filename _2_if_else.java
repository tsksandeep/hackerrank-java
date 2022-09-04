import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_if_else {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N > 1 && N < 6) {
                System.out.println("Not Weird");
            } else if (N > 5 && N < 21) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
}
