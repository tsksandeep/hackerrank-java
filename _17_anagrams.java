import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _17_anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var word1 = bufferedReader.readLine().trim();
        var word2 = bufferedReader.readLine().trim();

        HashMap<String, Integer> letterFrequency1 = new HashMap<>();
        HashMap<String, Integer> letterFrequency2 = new HashMap<>();

        for (var i = 0; i < word1.length(); i++) {
            var letter = word1.substring(i, i + 1);
            var count = letterFrequency1.get(letter);

            if (count == null) {
                letterFrequency1.put(letter.toLowerCase(), 1);
                continue;
            }

            letterFrequency1.put(letter, count + 1);
        }

        for (var i = 0; i < word2.length(); i++) {
            var letter = word2.substring(i, i + 1);
            var count = letterFrequency2.get(letter);

            if (count == null) {
                letterFrequency2.put(letter.toLowerCase(), 1);
                continue;
            }

            letterFrequency2.put(letter, count + 1);
        }

        if (word1.length() >= word2.length()) {
            for (Map.Entry<String, Integer> mapElement : letterFrequency1.entrySet()) {
                String key = mapElement.getKey();
                Integer val = mapElement.getValue();

                if (letterFrequency2.get(key) != val) {
                    System.out.println("Not Anagrams");
                    bufferedReader.close();
                    return;
                }
            }
        } else {
            for (Map.Entry<String, Integer> mapElement : letterFrequency2.entrySet()) {
                String key = mapElement.getKey();
                Integer val = mapElement.getValue();

                if (letterFrequency1.get(key) != val) {
                    System.out.println("Not Anagrams");
                    bufferedReader.close();
                    return;
                }
            }
        }

        System.out.println("Anagrams");
        bufferedReader.close();
    }
}