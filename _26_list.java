import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class _26_list {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer len = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> list = Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        Integer noOfQueries = Integer.parseInt(bufferedReader.readLine().trim());

        for (var i = 0; i < noOfQueries; i++) {
            var query = bufferedReader.readLine().trim();

            if (query.equalsIgnoreCase("Insert")) {
                var insertParam = Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
                list.add(insertParam.get(0), insertParam.get(1));
            }

            if (query.equalsIgnoreCase("Delete")) {
                int deleteParam = Integer.parseInt(bufferedReader.readLine().trim());
                list.remove(deleteParam);
            }
        }

        list.forEach(item -> System.out.print(item+" "));

        bufferedReader.close();
    }
}