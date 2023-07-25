package hackerRank;

import java.util.Collections;
import java.util.List;

public class PreparationWeek1 {

    double[] plusMinus(List<Integer> arr) {

        int size = arr.size();
        long positiveCount = arr.stream().filter(n -> n > 0).count();
        long negativeCount = arr.stream().filter(n -> n < 0).count();
        long zeroCount = arr.stream().filter(n -> n == 0).count();

        double[] result = new double[3];
        result[0] = Math.round(positiveCount * 1000000 / (double)size) / 1000000.0;
        result[1] = Math.round(negativeCount * 1000000/ (double)size) / 1000000.0;
        result[2] = Math.round(zeroCount * 1000000/ (double)size) / 1000000.0;

        for(double r : result) {
            System.out.printf("%.6f\n", r);
        }
        return result;
    }

    long[] miniMaxSum(List<Integer> arr) {
        long[] result = new long[2];

        long sum = arr.stream().mapToLong(n -> n).sum();

        Collections.sort(arr);

        result[0] = sum - arr.get(arr.size()-1);
        result[1] = sum - arr.get(0);

        for(long n : result) {
            System.out.printf("%d ", n);
        }
        return result;
    }
}
