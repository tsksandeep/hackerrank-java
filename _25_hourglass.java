import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class _25_hourglass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (var i = 0; i < 6; i++) {
            arr.add(Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt).collect(toList()));
        }

        var maximum = arr.get(0).get(0) + arr.get(0).get(1) + arr.get(0).get(2) + arr.get(2).get(0)
                + arr.get(2).get(1) + arr.get(2).get(2) + arr.get(1).get(1);

        for (var i = 0; i < 4; i++) {
            for (var j = 0; j < 4; j++) {
                var temp = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 2).get(j)
                        + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2) + arr.get(i + 1).get(j + 1);
                if (temp > maximum) {
                    maximum = temp;
                }
            }
        }

        System.out.println(maximum);
        bufferedReader.close();
    }

}