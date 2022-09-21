import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Linkedlist supports remove
// Arraylist is of fixed length

public class _22_arraylist {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<List<String>>();

        for (var i = 0; i < n; i++) {
            var l = new LinkedList<String>(Arrays.asList(bufferedReader.readLine().trim().split(" ")));

            l.remove(0);

            arr.add(l);
        }

        var q = Integer.parseInt(bufferedReader.readLine().trim());

        for (var i = 0; i < q; i++) {
            var qr = bufferedReader.readLine().trim().split(" ");

            try {
                System.out.println(arr.get(Integer.parseInt(qr[0]) - 1).get(Integer.parseInt(qr[1]) - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        bufferedReader.close();
    }
}
