import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _28_hashset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashSet.add(bufferedReader.readLine().trim());
            System.out.println(hashSet.size());
        }

        bufferedReader.close();
    }
}
