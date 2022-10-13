import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _31_bitset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var setLengthAndNoOfOperations = Stream.of(bufferedReader.readLine().trim().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        BitSet set1 = new BitSet(setLengthAndNoOfOperations.get(0).intValue());
        BitSet set2 = new BitSet(setLengthAndNoOfOperations.get(0).intValue());
        BitSet[] bitsets = { set1, set2 };

        for (int i = 0; i < setLengthAndNoOfOperations.get(1); i++) {
            var operation = bufferedReader.readLine().trim().split(" ");
            var firstArg = Integer.parseInt(operation[1]);
            var secondArg = Integer.parseInt(operation[2]);

            switch (operation[0]) {
                case "AND":
                    bitsets[firstArg - 1].and(bitsets[secondArg - 1]);
                    break;
                case "OR":
                    bitsets[firstArg - 1].or(bitsets[secondArg - 1]);
                    break;
                case "XOR":
                    bitsets[firstArg - 1].xor(bitsets[secondArg - 1]);
                    break;
                case "FLIP":
                    bitsets[firstArg - 1].flip(secondArg);
                    break;
                case "SET":
                    bitsets[firstArg - 1].set(secondArg);
                    break;
            }

            System.out.printf("%d %d%n",
                    set1.cardinality(),
                    set2.cardinality());
        }

        bufferedReader.close();

    }

}
