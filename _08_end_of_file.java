import java.io.*;

public class _08_end_of_file {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer count = 0;
            while (true) {
                String line = bufferedReader.readLine().trim();
                count += 1;
                System.out.println(String.format("%d %s", count, line));
            }

        } catch (Exception e) {
            return;
        }
    }
}