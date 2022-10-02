import java.io.*;

public class _07_datatype {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(bufferedReader.readLine().trim());

        for (var i = 0; i < N; i++) {
            String s = bufferedReader.readLine().trim();
            try {
                Long.parseLong(s);
                System.out.printf("%s can be fitted in:\n", s);
            } catch (Exception e) {
                System.out.printf("%s can't be fitted anywhere.\n", s);
                continue;
            }

            try {
                Byte.parseByte(s);
                System.out.println("* byte");
            } catch (Exception e) {
            }

            try {
                Short.parseShort(s);
                System.out.println("* short");
            } catch (Exception e) {
            }

            try {
                Integer.parseInt(s);
                System.out.println("* int");
            } catch (Exception e) {
            }

            System.out.println("* long");
        }

        bufferedReader.close();
    }
}
