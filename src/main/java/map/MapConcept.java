package map;

import map.vo.MyMapData;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcept {

    /*  Array 장점 + List 장점 => 유연하면서 빠르게 값을 찾아낼 수 있는 Map 등장
        Hashtable 주요 메소드
        > get, getOrDefault, put, putAll, putIfAbsent, remove, replace, values, keySet

        HashMap VS Hashtable
        > HashMap 은 Not synchronized
        > Hashtable 은 synchronized
        > ConcurrentHashMap 은 synchronized + high concurrency
     */
    public void practice_hashtable() {
        Map<String, Integer> map = new Hashtable<>();
        map.put("A", 1);
        map.put("B", 2);
        map.putIfAbsent("A", 100);
        map.putIfAbsent("C", 3);
        map.remove("B", 3); //return boolean (삭제시 있으면 true, 없으면 false)
        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.getOrDefault("C", -1));
    }

    // 커스텀 데이터(객체)를 Map 의 Key 로 사용하려면 HashCode 를 제공해줘야한다.
    public void practice_mydata() {
        Map<MyMapData, Integer> map = new ConcurrentHashMap<>();
        map.put(new MyMapData(1), 1);
        map.put(new MyMapData(2), 2);
        map.replace(new MyMapData(1), 1, 11);
        print_method(map);
    }

    private void print_method(Map<MyMapData, Integer> map) {
        System.out.println(map.remove(new MyMapData(2), 3));
        System.out.println(map);
        System.out.println(map.get(new MyMapData(1)));
        System.out.println(map.getOrDefault(new MyMapData(3), -1));
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
