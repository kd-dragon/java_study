package graph;

import java.util.*;


class Node {
    String name;
    List<Node> links;
    boolean visited;

    public Node(String name) {
        this.name = name;
        this.links = new LinkedList<>();
    }

    @Override
    public String toString() {
        return this.name;
    }

    void link(Node node) {
        links.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    void visit() {
        this.visited = true;
    }

    boolean isVisited() {
        return this.visited;
    }
}

public class GraphConcept {

    /*
        비선형 자료구조
        1) 방향성을 가지는 형태
        2) 가중치를 가지는 형태

        사용사례
        - 탐색 알고리즘 (BFS, DFS)
        1. 데이터 1개 읽기
        2. 다음에 읽을 데이터를 예약 (연결된 데이터를 찾기)
        3. 예약된 것을 하나 꺼내기
        4. 2~3번 반복

        Queue 에 담으면 BFS, Stack 에 담으면 DFS
     */

    // Graph 는 Node 와 Edge 로 구성된다. JAVA 에는 따로 지원하는 자료구조가 없어서 직접 구현해줘야한다.
    public static void main(String[] args) {
        List<Node> nodes = new LinkedList<>();

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        // 노드와 노드 사이를 연결하기 (연결 정보를 만든다.)
        a.link(b);
        a.link(d);

        b.link(a);
        b.link(c);
        b.link(e);

        c.link(b);
        c.link(d);

        d.link(a);
        d.link(c);
        d.link(e);

        e.link(b);
        e.link(d);
        // -- 노드와 노드 사이를 연결하기 (연결 정보를 만든다.)

        // 질문: 다음 A에서 E까지 가는 과정을 구하라.
        Node target = e;

        // BFS (Queue 사용)
        /*
        Queue<Node> queue = new LinkedList<>();
        queue.offer(a); // a를 기점으로 지정

        while(!queue.isEmpty()) {
            Node n = queue.poll();
            n.visit(); // 방문했다는 도장찍기!
            System.out.println(n); // 찾는 여정 출력

            if (n.equals(target)) {
                //find!
                System.out.println("FOUND!! --> " + n);
                break;
            }

            //연결되어있는 다음 데이터 예약 = 큐에 등록
            n.links.stream()
                    .filter(l -> !queue.contains(l)) //큐에포함되어있지않음.
                    .filter(l -> !l.isVisited()) //방문안함.
                    .forEach(queue::offer);
        }
        */
        System.out.println("====================================================\n");

        // DFS (Stack 사용)
        Stack<Node> stack = new Stack<>();
        stack.push(a); // a를 기점으로 지정

        while(!stack.isEmpty()) {
            Node n = stack.pop();
            n.visit(); // 방문했다는 도장찍기!
            System.out.println(n); // 찾는 여정 출력

            if (n.equals(target)) {
                //find!
                System.out.println("FOUND!! --> " + n);
                break;
            }

            //연결되어있는 다음 데이터 예약 = 큐에 등록
            n.links.stream()
                    .filter(l -> !stack.contains(l)) //큐에포함되어있지않음.
                    .filter(l -> !l.isVisited()) //방문안함.
                    .forEach(stack::push);
        }


    }
}
