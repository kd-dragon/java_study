package map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapAlgorithmPracticeTest {

    MapAlgorithmPractice mp = new MapAlgorithmPractice();

    @Test
    void pocketmon() {
        //given
        int[] inputs = new int[]{3,3,3,2,2,4};

        //when
        int result = mp.pocketmon(inputs);

        //then
        assertEquals(result, 3);
    }

    @Test
    void marathon_list() {
        //given
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        //when
        String result = mp.marathon_list(participant, completion);

        //then : "vinko"
        assertEquals(result, "vinko");
    }

    @Test
    void marathon_sort() {
        //given
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        //when
        String result = mp.marathon_sort(participant, completion);

        //then : "vinko"
        assertEquals(result, "vinko");
    }

    @Test
    void marathon_map() {
        //given
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        //when
        String result = mp.marathon_map(participant, completion);

        //then : "vinko"
        assertEquals(result, "vinko");
    }

    @Test
    void camo() {
        //given
        String[][] participant = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        //when
        int result = mp.camo(participant);

        //then : 5
        assertEquals(result, 5);
    }



}