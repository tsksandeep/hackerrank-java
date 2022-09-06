import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10_int_to_string {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
        bufferedReader.close();
    }
    
}
