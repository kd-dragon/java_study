package tree;

import java.util.*;

class MyTreeData implements Comparable<MyTreeData> {

    int v;

    public MyTreeData(int v) {
        this.v = v;
    }

    @Override
    public int compareTo(MyTreeData o) {
        return v - o.v;
    }

    @Override
    public String toString() {
        return String.valueOf(v);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTreeData that = (MyTreeData) o;
        return v == that.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}

public class TreeConcept {

    /*
        Tree?
        -> Graph 에 규칙을 부여한 데이터구조
     */

    //Binary Tree: Child 는 2개만

        /*
            >>> DFS 종류 - Stack
            (1) In-Order Travel (Root 를 가운데 읽는 방법)
            Left - Root - Right
            (2) Pre-Order Travel (Root 를 먼저 읽는 방법)
            Root - Left - Right
            (3) Post-Order Travel (Root 를 나중에 읽는 방법)
            Left - Right - Root

            >>> BFS 종류 - Queue
            (4) Level-Order Travel
         */

    // Binary Search Tree
    // -> 왼쪽 노드는 부모 노드보다 항상 작을 것/ 오른쪽 노드는 부모 노드보다 항상 클 것

    // Heap
    // Root 에는 항상 최소 값이 있을 것 (Child 는 부모보다 커야한다.) - 최소 힙
    // Root 에는 항상 최대 값이 있을 것 (Child 는 부모보다 작아야한다.) - 최대 힙

    // 데이터를 추가할 때는 규칙이 변함 없도록 (일단 넣어 놓고 heapify)
    // 데이터를 꺼낼 때도 규칙 변함 없도록 (일단 꺼내 놓고 heapify)

    public static void main(String[] args) {

        // Binary Search Tree
        Set<MyTreeData> set = new TreeSet<>(); // Binary Search Tree 를 이용해서 Set 기능을 제공한다.

        set.add(new MyTreeData(1));
        set.add(new MyTreeData(2));
        set.add(new MyTreeData(3));

        set.add(new MyTreeData(1)); // 값이 존재하는지 빠르게 확인하고
        set.add(new MyTreeData(2));
        set.add(new MyTreeData(3));

        System.out.println(set);

        System.out.println("=====================================================");
        // Heap
        Queue<Integer> queue = new PriorityQueue<>(); //기본 min Heap
        queue.offer(100);
        queue.offer(60);
        queue.offer(10);
        queue.offer(30);

        //작은 값부터 꺼내게 된다.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("=====================================================");

        // Max Heap으로 만들어보기
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(10);
        maxHeap.offer(100);
        maxHeap.offer(30);
        maxHeap.offer(60);

        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());



    }
}
