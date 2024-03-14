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
     * Complete the 'plusMinus' function below.
     * The function accepts INTEGER_ARRAY arr as parameter.
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6  places after the decimal.
     */

	 public static void plusMinus(List<Integer> arr) {
	        // Initialize counters for positive, negative, and zero elements
	        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

	        // Iterate through the array and count positive, negative, and zero elements
	        for (Integer num : arr) {
	            if (num > 0) {
	                positiveCount++;
	            } else if (num < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }
	        }

	        // Calculate ratios
	        int totalElements = arr.size();
	        double positiveRatio = (double) positiveCount / totalElements;
	        double negativeRatio = (double) negativeCount / totalElements;
	        double zeroRatio = (double) zeroCount / totalElements;

	        // Print the ratios with 6 decimal places
	        System.out.printf("%.6f%n", positiveRatio);
	        System.out.printf("%.6f%n", negativeRatio);
	        System.out.printf("%.6f%n", zeroRatio);
	    }
	}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
