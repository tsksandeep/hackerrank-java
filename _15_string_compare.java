import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// sliding window technique
public class _15_string_compare {
    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var text = bufferedReader.readLine().trim();
        var substringLength = Integer.parseInt(bufferedReader.readLine().trim());

        var smallest = text.substring(0, substringLength);
        var largest = text.substring(0, substringLength);

        for (var i = 1; i < text.length(); i++) {
            try {
                var substring = text.substring(i, i + substringLength);

                if (substring.compareTo(smallest) < 0) {
                    smallest = substring;
                }

                if (substring.compareTo(largest) > 0) {
                    largest = substring;
                }

            } catch (Exception e) {
                break;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }

}
