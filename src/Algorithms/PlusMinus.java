package Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Resultt.plusMinus(arr);

        bufferedReader.close();
    }
}

class Resultt {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double cPlus = 0;
        double cMinus = 0;
        double cZero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                cPlus++;
            } else if (integer < 0) {
                cMinus++;
            } else {
                cZero++;
            }
        }
        System.out.println(cPlus / arr.size());
        System.out.println(cMinus / arr.size());
        System.out.println(cZero / arr.size());
    }

}
