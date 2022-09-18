import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _18_string_tokens {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var line = bufferedReader.readLine().trim();

        var lineSplit = line.split("[!,?._'@ ]");

        var count = 0;

        List<String> newList = new ArrayList<String>();

        for (String word : lineSplit) {
            if (word.equals("")) {
                continue;
            }
            count++;
            newList.add(word);
        }

        System.out.println(count);

        for (String word : newList) {
            System.out.println(word);
        }

        bufferedReader.close();
    }
}
