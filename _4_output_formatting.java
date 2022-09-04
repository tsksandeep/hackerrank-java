import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_output_formatting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("================================");

        String[] line1Split = bufferedReader.readLine().trim().split(" ");
        String[] line2Split = bufferedReader.readLine().trim().split(" ");
        String[] line3Split = bufferedReader.readLine().trim().split(" ");

        System.out.printf("%-15s%03d\n", line1Split[0], Integer.parseInt(line1Split[1]));
        System.out.printf("%-15s%03d\n", line2Split[0], Integer.parseInt(line2Split[1]));
        System.out.printf("%-15s%03d\n", line3Split[0], Integer.parseInt(line3Split[1]));

        System.out.println("================================");

        bufferedReader.close();
    }
}
