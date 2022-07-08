package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class MyData {
    int v;

    public MyData(int v) {
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
        MyData myData = (MyData) o;
        return v == myData.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}
public class SetConcept {

    /*
        HashSet
        Not synchronize
        내부에서는 hash table 사용. (hash table 에서 빠르게 값의 존재 여부를 확인)
        bucket 을 가지고 있으므로 initial capacity 값 존재. (퍼포먼스에 중요한 영향)
     */
    public static void main(String[] args) {
        Set<MyData> setA = new HashSet<>(); // set 은 순서를 보장하지 않는다.
        Set<MyData> setB = new HashSet<>();

        // 집합 A
        setA.add(new MyData(1));
        setA.add(new MyData(2));
        setA.add(new MyData(3));

        // 집합 B
        setB.add(new MyData(2));
        setB.add(new MyData(3));
        setB.add(new MyData(4));

        // A + B
        //setA.addAll(setB);
        //System.out.println(setA);

        // A - B
        //setA.removeAll(setB);
        //System.out.println(setA);

        // A * B
        setA.retainAll(setB);
        System.out.println(setA);


    }
}
