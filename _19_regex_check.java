import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class _19_regex_check {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int noOfInputs = Integer.parseInt(bufferedReader.readLine().trim());

        for (var i = 0; i < noOfInputs; i++) {
            var regexPattern = bufferedReader.readLine().trim();

            try {
                Pattern.compile(regexPattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }

        bufferedReader.close();
    }

}
