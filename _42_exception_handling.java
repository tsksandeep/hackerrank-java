import java.util.Scanner;

class MyCalculator {
    long power(int a, int b) throws Exception {
        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        }

        double result = Math.pow(Double.parseDouble(String.valueOf(a)), Double.parseDouble(String.valueOf(b)));

        return Double.valueOf(result).longValue();
    }

}

public class _42_exception_handling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}