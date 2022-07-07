package list;

import list.vo.MyData;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListPractice {

    /*
    LinkedList 는 Doubly-linked list(양방향)로 구현 되어있다.
    ArrayList 는 resizable array 를 구현하고 있다. size 가 커질 경우(initialCapacity 값을 초과할 때) 더 큰 array 를 생성하여 기존 값을 복사해온다. (조회에 유리)
    Vector 는 growable array (resizable array 와 동일)

     * ArrayList VS Vector
        -> ArrayList 는 동기화(synchronized) 구현체가 아니다. Vector 는 Synchronized, thread-safe.
    */

    public List<? extends Object> integerPractice() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 5);
        list.remove(2);

        System.out.println(list.get(2));
        System.out.println(list.contains(5));

        System.out.println(list);
        return list;
    }

    public boolean objectPractice() {
        List<MyData> lklist = new LinkedList<>();

        lklist.add(MyData.create(1));
        lklist.add(MyData.create(2));
        lklist.add(MyData.create(3));

        System.out.println(lklist.contains(1));
        System.out.println(lklist);

        return lklist.contains(MyData.create(1));
    }

    public boolean listVectorPractice() {
        List<MyData> vlist = new Vector<>(); // 벡터형이지만 리스트형으로도 표현 가능하다. (형이 다양하다 -> 다형성)
        vlist.add(MyData.create(1));
        vlist.add(MyData.create(2));
        vlist.add(MyData.create(3));

        System.out.println(vlist.contains(1));
        System.out.println(vlist);

        return vlist.contains(MyData.create(1));
   }
}
