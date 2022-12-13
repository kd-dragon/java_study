package programmers;

import java.util.Arrays;
import java.util.Collections;

public class FruitSeller135808 {
    public static void main(String[] args)  {

        int[] score = new int[]{4,1,2,2,4,4,4,4,1,2,4,2};
        int k = 4;
        int m = 3;

        int answer = 0;
        Integer[] tmpArr = Arrays.stream(score).boxed().toArray(Integer[] :: new);
        Arrays.sort(tmpArr, Collections.reverseOrder());

        int idx = 1;
        while(idx * m < score.length+1) {
            int check_offset = idx*m -1;
            answer += (tmpArr[check_offset] * m);
            idx ++;
        }

        System.out.println(answer);
    }
}
