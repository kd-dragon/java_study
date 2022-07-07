package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class CodingTest {

    /**
     * 문제1: 주어진 입력중 최대값을 구하고, 최대값이 위치하는 index 값의 목록을 반환
     */
    public int[] find_max_index_array(int[] arr) {
        //최대값 구하기
        int max = 0;
        for(int n : arr) if (n > max) max = n;
        //최대값이 몇개인지 확인하기기
        int count = 0;
        for(int n : arr) if (n == max) count++;
        //배열 만들기
        int[] answer = new int[count];
        //배열에 인덱스 채우기
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == max) answer[index++] = i;
        }
        return answer;
    }

    public int[] find_max_index_list(int[] arr) {

        //max 까지는 OptionalInt 타입
        int max = Arrays.stream(arr).max().getAsInt();

        // 리스트 만들기
        // List<Integer> list = new LinkedList<>();

        // 배열에 인덱스 채우기
        int[] answer = IntStream.range(0, arr.length)
                .filter(i -> arr[i] == max)
                .toArray();

        // 리스트를 배열로 변환
        //int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        /*
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
         */
        return answer;
    }

    /**
     * 순열 검사
     */
    public boolean permutation(int[] arr) {
        // 정답 배열 만들기
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) answer[i] = i+1; // O(n)

        // input 배열 정렬
        Arrays.sort(arr); // O(nlogn)

        // 배열 비교하기
        return Arrays.equals(answer, arr); //O(n)
    }

    /**
     * 자연수 뒤집어 배열로 만들기
     */
    public int[] reverse_natural_number(long n) {
        List<Integer> list = new LinkedList<>();

        while(n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
