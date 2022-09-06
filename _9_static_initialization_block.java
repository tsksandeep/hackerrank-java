import java.io.*;

public class _9_static_initialization_block {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer breadth = Integer.parseInt(bufferedReader.readLine().trim());
        Integer height = Integer.parseInt(bufferedReader.readLine().trim());

        if (breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        bufferedReader.close();
        return;
    }
}
