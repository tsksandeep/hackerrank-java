import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13_strings {
    public static void main(String[] args) throws IOException {
        var bufferReader = new BufferedReader(new InputStreamReader(System.in));

        var str1 = bufferReader.readLine().trim();
        var str2 = bufferReader.readLine().trim();

        System.out.println(str1.length() + str2.length());
        System.out.println(str1.compareTo(str2) > 0 ? "Yes" : "No");
        System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) + " "
                + str2.substring(0, 1).toUpperCase() + str2.substring(1));

        bufferReader.close();
    }
}