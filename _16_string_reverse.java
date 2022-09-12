import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Do not use == for string equal

public class _16_string_reverse {
    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var text = bufferedReader.readLine().trim();

        StringBuilder strBuilder = new StringBuilder(text);

        if (text.equals(strBuilder.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        bufferedReader.close();

    }
}
