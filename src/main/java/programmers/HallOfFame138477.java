package programmers;

import java.util.PriorityQueue;

public class HallOfFame138477 {

    // question
    // https://school.programmers.co.kr/learn/courses/30/lessons/138477?language=java

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i=0; i<score.length; i++) {
            priorityQueue.offer(score[i]);

            if(priorityQueue.size() <= k) {

                answer[i] = priorityQueue.peek();
                continue;
            }
            priorityQueue.poll();
            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}
