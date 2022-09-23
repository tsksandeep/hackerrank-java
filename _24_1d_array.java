import java.io.*;

public class _24_1d_array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        bufferedReader.close();
    }
}
