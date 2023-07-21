package sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortAlgorithmPractice {

    public int[] smallestNumber(int[] arr) {
        // 배열의 크기가 1이면 -1을 채운다.
        if(arr != null && arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr)
                .filter(a-> a != min)
                .toArray();
    }

    public String[] mySortString(String[] strings, int n) {
       Arrays.sort(strings, (s1, s2) -> {
          if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
          return s1.charAt(n) - s2.charAt(n);
       });
       return strings;
    }

    public String toJadenCase(String s) {
        StringBuilder sb = new StringBuilder();

        // 모두 소문자로 만든다.
        String s2 = s.toLowerCase();
        char last = ' ';
        // 한글자씩 뽑아서 answer에 더한다.
        for(char c : s2.toCharArray()) {
            if(last == ' ') c = Character.toUpperCase(c);
            sb.append(c);
            last = c;
        }
        return sb.toString();
    }

    public int hIndex(int[] citations) {
        // [3, 0, 6, 1, 5]
        // [0, 1, 3, 5, 6] -> length 에서 자기 자신의 인덱스를 뺀 값이 h-index

        Arrays.sort(citations);

        // n보다 큰 숫자가 n개 이상 있으면 H-index
        for (int i=0; i<citations.length; i++) {
            int h = citations.length - i;
            if(citations[i] >= h) return h;
        }
        return 0;
    }
}
