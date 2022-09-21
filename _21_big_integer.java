import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// Cannot use +, * directly on BigInteger
// Instead use .add, .multiply

public class _21_big_integer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var number1 = new BigInteger(bufferedReader.readLine().trim());
        var number2 = new BigInteger(bufferedReader.readLine().trim());

        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));

        bufferedReader.close();
    }
}
