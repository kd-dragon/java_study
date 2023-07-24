package tree;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class TreeAlgorithmPractice {

    public int moreSpicy(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(queue::add);

        int count = 0;
        while(queue.size() >= 2 && queue.peek() < K) {
            int a = queue.poll();
            int b = queue.poll();
            int scov = a + (b * b);

            queue.offer(scov);
            count ++;
        }
        if(queue.peek() < K) {
            return -1;
        }

        return count;
    }
}
