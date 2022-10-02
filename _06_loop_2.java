import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_loop_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(bufferedReader.readLine().trim());

        for (var i = 0; i < N; i++) {
            String[] intStringSplit = bufferedReader.readLine().trim().split(" ");
            Integer a = Integer.parseInt(intStringSplit[0]);
            Integer b = Integer.parseInt(intStringSplit[1]);
            Integer n = Integer.parseInt(intStringSplit[2]);

            for (var j = 0; j < n; j++) {
                Integer c = 1;
                Integer current = 1;
                for (var k = 1; k < j + 1; k++) {
                    current *= 2;
                    c += current;
                }

                Integer total = a + (b * c);
                if (j == n - 1) {
                    System.out.print(total + "\n");
                    break;
                }

                System.out.print(total + " ");
            }
        }
        bufferedReader.close();
    }
}
