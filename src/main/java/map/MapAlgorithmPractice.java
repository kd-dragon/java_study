package map;

import java.util.*;

public class MapAlgorithmPractice {

    public int pocketmon(int[] nums) {
        // 포켓몬의 종류의 갯수를 구한다.
        Set<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int n1 = set.size();
        int n2 = nums.length / 2;
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, 0);
        }
        int n1 = map.keySet().size();

        // 배열 크기의 1/2을 구한다.
        int n2 = nums.length / 2;
        */
        // 그 2개의 최소값을 선택한다.
        return Math.min(n1, n2);
    }

    public String marathon_list(String[] participants, String[] completion) {
        List<String> players = new LinkedList<>();
        for(String p : participants) players.add(p);
        for(String c : completion) players.remove(c); //<--- LinkedList는 삭제시 c를 찾는 시간때문에 성능 떨어짐

        return players.get(0);
    }

    public String marathon_sort(String[] participants, String[] completion) {

        Arrays.sort(participants); //O(NlogN)
        Arrays.sort(completion); //O(NlogN)

        //O(n)
        for(int i=0; i<completion.length; i++) {
            if(!participants[i].equals(completion[i])) return participants[i];
        }
        return participants[participants.length-1];
        //total -- O(NlogN)
    }

    public String marathon_map(String[] participants, String[] completion) {
        Map<String, Integer> players = new HashMap<>();

        //O(N)
        for(String p : participants) {
            players.put(p, players.getOrDefault(p, 0) + 1);
        }
        //O(N)
        for(String c : completion) {
            Integer n = players.get(c) - 1;
            if (n == 0) players.remove(c);
            else players.put(c, n);
        }

        //O(1)
        return players.keySet().iterator().next();
        //total -- O(N)
    }

    /**
     * 서로 다른 위장 할 수 있는 모든 종류를 구하라
     * @param clothes
     * @return
     */
    public int camo(String[][] clothes) {

        // ex) "yellow_hat", "headgear", "blue_sunglasses", "eyewear", "green_turban", "headgear"
        // headgear : 2 -> 경우의수 3개 (한번씩 쓰거나 둘다 안쓰거나)
        // eyewear : 1 -> 경우의수 2개 (쓰거나 안쓰거나)
        // > 총 경우의 수 3 * 2 = 6개, 단 위장을 안한 경우의 수는 빼야한다. 즉, 6 - 1 = 5개

        Map<String, Integer> map = new HashMap<>();
        //위장 용품의 종류별 개수를 구한다.
        for(String[] c : clothes) {
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        //각 개수의 +1을 모두 곱한다.
        int answer = 1;
        var iterator = map.values().iterator();
        while(iterator.hasNext()) {
            answer *= iterator.next() + 1;
        }
        //전체 경우의 수에서 -1을 해서 리턴한다.
        return answer - 1;
    }
}
