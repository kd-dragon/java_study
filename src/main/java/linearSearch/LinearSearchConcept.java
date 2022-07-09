package linearSearch;

import java.util.*;

class MyLinearData implements Comparable<MyLinearData> {
    int v;

    public MyLinearData(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "" + v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinearData that = (MyLinearData) o;
        return v == that.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }

    @Override
    public int compareTo(MyLinearData o) {
        // 내 것과 남의 것을 뺀 값으로 비교.
        return v - o.v;
    }
}

/*
    search 는 indexOf, contains, remove 같은 곳에서 이미 구현되어있습니다. -> 완전탐색
    단, 커스텀클래스를 갖는 경우 equals 가 구현될 필요가 있다.

 */

public class LinearSearchConcept {
    public static void main(String[] args) {
        List<MyLinearData> list = new LinkedList<>();

        for (int i = 1; i <= 100; i++) list.add(new MyLinearData(i));
        System.out.println(list);

        // binarySearch 이용하기
        // 찾는 객체가 Comparable 인터페이스를 구현해야한다. !
        // 리턴값은 인덱스 int 값이다.
        // binarySearch 를 이용하려면 순차적으로 이미 정렬이 되어있어야한다.
        int index = Collections.binarySearch(list, new MyLinearData(63));

        //int index = list.indexOf(new MyLinearData(63));
        System.out.println(index);

    }
}
