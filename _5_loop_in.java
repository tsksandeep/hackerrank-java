import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_loop_in {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(bufferedReader.readLine().trim());

        for (var i = 0; i < 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i + 1, N * (i + 1)));
        }

        bufferedReader.close();
    }
}