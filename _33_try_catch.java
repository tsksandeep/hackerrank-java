import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _33_try_catch {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer x = 0;
        Integer y = 0;

        try {
            x = Integer.parseInt(bufferedReader.readLine().trim());
            y = Integer.parseInt(bufferedReader.readLine().trim());
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
            return;
        }

        if (y.equals(0)) {
            System.out.println("java.lang.ArithmeticException: / by zero");
            return;
        }

        System.out.println(x / y);

        bufferedReader.close();
    }
}