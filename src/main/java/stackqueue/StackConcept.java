package stackqueue;

import java.util.LinkedList;
import java.util.Stack;

public class StackConcept {

    /*
        Stack
        - LIFO
        push - 값을 넣는다
        pop - 값을 꺼낸다
        peek - 꺼낼 값을 확인만 한다.
        
        * 데이터를 넣은 역순으로 꺼내야할 경우 사용하는 컨셉
     */
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);


        // List 로 Stack 구현하기
        /*

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);

         */

    }
}
