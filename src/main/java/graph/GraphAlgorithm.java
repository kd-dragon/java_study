package graph;

import javax.swing.text.Position;
import java.util.*;
import java.util.function.Predicate;

public class GraphAlgorithm {
    public int networkCount(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) {
            if(visited[i]) continue;
            answer ++;
            visitAllConnectedComputers(computers, visited, i);
        }

        return answer;
    }

    void visitAllConnectedComputers(int[][] computers, boolean[] visited, int idx) {
        //BFS, DFS 모두 사용 가능

        //BFS 구현 (Queue)
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        while(!q.isEmpty()) {
            int i = q.poll();
            visited[i] = true;

            for(int j=0; j<computers[i].length; j++) {
                if(visited[j]) continue;
                if(computers[i][j] == 1) q.offer(j);
            }
        }
    }

    public int targetNumber(int[] numbers, int target) {
        int answer = 0;

        // n > 0 (n은 정수)
        // 순서를 바꾸지 않는다.

       /*
        -1+1+1+1+1 = 3
        +1-1+1+1+1 = 3
        +1+1-1+1+1 = 3
        +1+1+1-1+1 = 3
        +1+1+1+1-1 = 3
        */
        return sumCount(numbers, target, 0, 0);
    }

    int sumCount(int[] numbers, int target, int idx, int sum) {
        if(idx == numbers.length) {
            if(sum == target) return 1;
            return 0;
        }
        return sumCount(numbers, target, idx+1, sum + numbers[idx]) +
        sumCount(numbers, target, idx+1, sum - numbers[idx]);
    }

    class Word {
        String word;
        int count;
        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    public int convertWord(String begin, String target, String[] words) {
        if(Arrays.asList(words).indexOf(target) == -1) return 0;
        Set<String> used = new HashSet<>();

        Stack<Word> stack = new Stack<>();
        stack.add(new Word(begin, 0));

        while(!stack.isEmpty()) {
            Word now = stack.pop();

            if(now.word.equals(target)) {
                return now.count;
            }

            for(String w : words) {
                // 한 글자만 다른 경우
                if(!changable(now.word, w)) continue;
                // 이미 사용한 단어 체크 (중복 사용 불가능)
                if(used.contains(w)) continue;

                used.add(w);
                stack.push(new Word(w, now.count+1));
            }
        }
        return 0;
    }

    boolean changable(String w1, String w2) {
        // w1, w2 길이는 같다는 조건이 있음
        int count = 0;
        for(int i=0; i<w1.length(); i++) {
            if(w1.charAt(i) != w2.charAt(i)) count++;
            if(count > 1) return false;
        }
        return count == 1;
    }

    class Position {
        int steps;
        int posX, posY;

        boolean equalsPosition(int x, int y) {
            return (this.posX == x && this.posY == y);
        }

        public Position(int x, int y, int steps) {
            this.posX = x;
            this.posY = y;
            this.steps = steps;
        }
    }
    public int gameMap(int[][] maps) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(0, 0, 1));
        boolean[][] visited = new boolean[maps.length][maps[0].length];

        while(!queue.isEmpty()) {
            Position now = queue.poll();

            if(now.posX < 0 || now.posX >= maps.length) continue; // 맵밖
            if(now.posY < 0 || now.posY >= maps[0].length) continue; // 맵밖
            if(maps[now.posX][now.posY] == 0) continue; // 벽
            if(visited[now.posX][now.posY]) continue; //이미 방문

            visited[now.posX][now.posY] = true;
            if(now.equalsPosition(maps.length-1, maps[0].length-1)) {
                return now.steps;
            }

            // 포지션 이동 경우의 수 (동서남북) + 이동할 때마다 step은 늘어난다.
            // 다음 방문할 곳 큐에 등록
            queue.offer(new Position(now.posX - 1, now.posY, now.steps + 1)); // 왼쪽
            queue.offer(new Position(now.posX + 1, now.posY, now.steps + 1)); // 오른쪽
            queue.offer(new Position(now.posX, now.posY + 1, now.steps + 1)); // 위
            queue.offer(new Position(now.posX, now.posY -1, now.steps + 1)); // 아래
        }
        return -1;
    }
}
