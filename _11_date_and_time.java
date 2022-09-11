import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// both DAY (Sunday, ...) and MONTH (Januaury, ...) starts from 0 in Java.util.Calendar so use -1
public class _11_date_and_time {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var inputSplit = bufferedReader.readLine().trim().split(" ");

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Integer.parseInt(inputSplit[0]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(inputSplit[1]));
        calendar.set(Calendar.YEAR, Integer.parseInt(inputSplit[2]));

        var dayOfTheWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

        System.out.println(dayOfTheWeek);

        bufferedReader.close();
    }
}