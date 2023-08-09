package hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PreparationWeek2 {

    int sockMerchant(int n, List<Integer> ar) {
        List<Integer> sortedSocks = ar.stream()
                .sorted()
                .collect(Collectors.toList());

        int preColor = 0;
        int pairCount = 0;
        for(int i=0; i<n; i++) {
            int color = sortedSocks.remove(0);
            if (color == preColor) {
                pairCount ++;
                preColor = 0;
                continue;
            }
            preColor = color;
        }
       // 1 1 1 2 2 2 3
        return pairCount;
    }

    void findZigZagSequence(int [] a, int n) {
        Arrays.sort(a);
        int mid = n/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
