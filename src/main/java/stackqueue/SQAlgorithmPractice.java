package stackqueue;

import java.awt.print.Paper;
import java.util.*;

public class SQAlgorithmPractice {

    // 괄호가 바르게 짝지어졌는지 검사하기
    public boolean correctParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.empty() && c == ')') return false;
            if (c == '(') {
                stack.push(c);
                continue;
            }
            stack.pop();
        }

        return stack.empty();
    }

    public boolean correctParenthesesInteger(String s) {
        int stack = 0;

        for (char c : s.toCharArray()) {
            if (stack == 0 && c == ')') return false;
            if (c == '(') {
                stack ++;
                continue;
            }
            stack --;
        }

        return stack == 0;
    }

    public int[] funcDevelop(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        // 남은 일 수를 구한다.
        for (int i=0; i<progresses.length; i++) {
            int remain = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) remain += 1;
            queue.offer(remain);
        }

        List<Integer> answer = new LinkedList<>();

        // 앞에서 부터 차례대로 일수를 비교하여 카운팅
        int last = queue.poll();
        int cnt = 1;
        while(!queue.isEmpty()) {
            if (last < queue.peek()) {
                answer.add(cnt);
                last = queue.poll();
                cnt = 1;
                if (queue.size() == 0) {
                    answer.add(cnt);
                    break;
                }
                continue;
            }
            queue.poll();
            cnt ++;

            if (queue.size() == 0){
                answer.add(cnt);
            }
        }

        // 카운팅 값을 배열에 담아 리턴.
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] funcDevelop2(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        // 남은 일 수를 구한다.
        for (int i=0; i<progresses.length; i++) {
            float p = progresses[i];
            float s = speeds[i];
            int days = (int) Math.ceil((100 - p) / s);
            queue.offer(days);
        }

        Queue<Integer> answer = new LinkedList<>();
        int d = queue.poll();
        int count = 1;
        while(!queue.isEmpty()) {
            int n = queue.poll();
            if(d >= n) {
                count ++;
                continue;
            }
            answer.offer(count);
            count = 1;
            d = n;
        }
        answer.offer(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] priceStock(int[] prices) {

        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++) {
            int price = prices[i];
            int seconds = 0;
            for(int j=i+1; j<prices.length; j++) {
                seconds++;
                if(price > prices[j]) break;
            }

            answer[i] = seconds;
        }

        return answer;
    }

    public int printingPriority(int[] priorities, int location) {

        // [2, 1, (3), 2]
        // 2 [1, (3), 2]
        // 1 [(3), 2, 2]
        // (3) [2, 2, 1] --> 1번째로 출력된다.

        // 한 개의 데이터의 2가지 의미를 가지고 있어야한다는 것이 핵심 포인트!
        // 1.우선순위, 2.내 문서 여부
        // 이럴 경우 class 를 만들어서 사용하자.

        List<Paper> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.add(new Paper(priorities[i], i == location));
        }

        int answer = 0;
        while(!queue.isEmpty()) {
            Paper now = queue.remove(0);
            boolean printable = true;
            for (Paper p : queue) {
                if (now.priority < p.priority) {
                    printable = false;
                    break;
                }
            }
            if (!printable) {
                queue.add(now);
                continue;
            }
            answer ++;
            if(now.isMine) return answer;
        }
        return 0;
    }

    class Paper {
        boolean isMine;
        int priority;
        Paper(int p, boolean m) {priority=p; isMine=m;}
    }
}
