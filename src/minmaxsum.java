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

    /*
     * Complete the 'miniMaxSum' function below.
     * The function accepts INTEGER_ARRAY arr as parameter.
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     */

	 public static void miniMaxSum(List<Integer> arr) {
	        // Initialize variables to store min and max sums
	        long minSum = Long.MAX_VALUE;
	        long maxSum = Long.MIN_VALUE;
	        long totalSum = 0;

	        // Calculate total sum and find min and max sums
	        for (int num : arr) {
	            totalSum += num;
	        }

	        for (int num : arr) {
	            minSum = Math.min(minSum, totalSum - num);
	            maxSum = Math.max(maxSum, totalSum - num);
	        }

	        // Print the respective minimum and maximum values
	        System.out.println(minSum + " " + maxSum);
	    }
	}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
