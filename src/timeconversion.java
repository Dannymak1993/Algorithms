import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /* Complete the 'timeConversion' function below.
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

     */

    public static String timeConversion(String s) {
    // Write your code here
    	String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2].substring(0, 2));
        String meridiem = parts[2].substring(2);

        // Adjust hour based on AM/PM
        if (meridiem.equalsIgnoreCase("PM") && hour != 12) {
            hour += 12;
        } else if (meridiem.equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }

        // Format the hour, minute, and second into 24-hour format
        String militaryTime = String.format("%02d:%02d:%02d", hour, minute, second);

        return militaryTime;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
