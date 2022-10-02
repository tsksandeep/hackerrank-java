import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class _03_stdin_stdout_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(bufferedReader.readLine());
        double d = Double.parseDouble(bufferedReader.readLine());
        String s = bufferedReader.readLine();

        System.out.println(String.format("String: %s", s));
        System.out.println("Double: " + d);
        System.out.println(String.format("Int: %d", n));

        bufferedReader.close();
    }
}