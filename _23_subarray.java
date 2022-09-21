import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// sliding window

public class _23_subarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var length = Integer.parseInt(bufferedReader.readLine().trim());

        var arrStringList = bufferedReader.readLine().trim().split(" ");

        List<Integer> arrList = new ArrayList<>();

        for (String element : arrStringList) {
            arrList.add(Integer.parseInt(element));
        }

        var count = 0;

        for (var i = 0; i <= length; i++) {
            for (var j = 1; j <= length; j++) {
                try {
                    var total = 0;
                    for (Integer val : arrList.subList(i, i + j)) {
                        total += val;
                    }

                    if (total < 0) {
                        count++;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        System.out.println(count);
        bufferedReader.close();
    }
}
