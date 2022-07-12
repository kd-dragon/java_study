package sort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MySortData implements Comparable<MySortData> {
    int v;

    public MySortData(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return String.valueOf(v);
    }

    @Override
    public int compareTo(MySortData o) {
        //return v - o.v;
        return Integer.compare(v, o.v);
    }
}

public class SortConcept {


    /*
        Sort = 정렬 = 순서 바꾸기
        오름차순 VS 내림차순

        정렬 종류
        1) Bubble sort - 일일히 비교하는 방법
        2) Insertion sort - 맨 처음 값 고정, 2번째 값부터 왼쪽과 비교하면서 왼쪽에 삽입.
        3) Selection sort - 최소값을 찾아서 가장 왼쪽에 둔다.
        4) Quick sort - 작은 것, 큰 것을 나눠서 합친다.
        5) Merge sort - 일단 나누고 작은 것 부터 하나씩 합쳐가는 방식
     */

    public static void main(String[] args) {
        List<MySortData> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) list.add(new MySortData(r.nextInt(50)));


        //list.sort(Comparator.reverseOrder());

        /*
            Comparator => Interface.
            직접 구현해보기
         */
        //내림차순
        list.sort(new Comparator<MySortData>() {
            @Override
            public int compare(MySortData o1, MySortData o2) {
                return o2.compareTo(o1);
            }
        });

        //list.sort(Comparator.reverseOrder());
        list = quickSort(list);

        System.out.println(list);
    }

    //퀵 정렬 구현해보기. (오름차순)
    private static List<MySortData> quickSort(List<MySortData> list) {

        if(list.size() <= 1) return list;

        MySortData pivot = list.remove(0);

        List<MySortData> left = new LinkedList<>();
        List<MySortData> right = new LinkedList<>();

        for(MySortData m : list) {
            if(m.compareTo(pivot) < 0) left.add(m);
            else right.add(m);
        }

        List<MySortData> merge = new LinkedList<>();
        merge.addAll(quickSort(left));
        merge.add(pivot);
        merge.addAll(quickSort(right));

        return merge;
    }

}
