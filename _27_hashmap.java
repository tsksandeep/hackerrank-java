import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _27_hashmap {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int entries = Integer.parseInt(bufferedReader.readLine().trim());

        HashMap<String, String> entryBook = new HashMap<>();

        for (int i = 0; i < entries; i++) {
            var name = bufferedReader.readLine().trim();
            var phoneNumber = bufferedReader.readLine().trim();

            entryBook.put(name, phoneNumber);
        }

        while (true) {
            try {
                String name = bufferedReader.readLine().trim();
                var phoneNumber = entryBook.get(name);

                if (phoneNumber != null) {
                    System.out.println(name + "=" + phoneNumber);
                } else {
                    System.out.println("Not found");
                }
            } catch (Exception e) {
                break;
            }
        }

        bufferedReader.close();
    }
}
