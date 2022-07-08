package stackqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {

    /*
        Queue
        - FIFO
        offer, poll, peek

        Deque (양쪽에서 꺼내 쓸수 있는 큐) -> 단, 중간에 데이터는 꺼낼 수 없다.
        - offerFirst, offerLast

        * 데이터를 넣은 순서대로 꺼내야할 경우 사용하는 컨셉
     */
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek()); // peek 은 값을 꺼내지않고 확인만 한다.
        System.out.println(queue);
        System.out.println("====================DEQUE========================");
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);

        //List 로 Queue 구현하기
        /*
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        */
    }
}
