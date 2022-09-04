import java.util.*;

public class _1_stdin_stdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (var i = 0; i < 3; i++) {
            int myInt = scan.nextInt();
            System.out.println(myInt);
        }
        scan.close();
    }
}