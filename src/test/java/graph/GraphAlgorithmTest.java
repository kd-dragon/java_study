package graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphAlgorithmTest {

    GraphAlgorithm ga = new GraphAlgorithm();

    @Test
    void networkProblem() {
        // given
        int n = 3;
        //int[][] computers = new int[][]{{1,1,0}, {1,1,0}, {0,0,1}};
        int[][] computers = new int[][]{{1,1,0}, {1,1,1}, {0,1,1}};

        // when
        int result = ga.networkCount(n, computers);

        // then
       // assertEquals(result, 2);
        assertEquals(result, 1);
    }

    @Test
    void targetNumberProblem() {
        // given
        int[] numbers = new int[]{1,1,1,1,1};
        int target = 3;

        // when
        int result = ga.targetNumber(numbers, target);

        // then
        assertEquals(result, 5);
    }

    @Test
    void convertWordProblem() {
        // given
        String begin = "hit";
        String target = "cog";
        String[] words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};

        // when
        int result = ga.convertWord(begin, target, words);

        // then
        assertEquals(result, 4);
    }

    @Test
    void gameMap() {
        // given
        int[][] maps = new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };

        // when
        int result = ga.gameMap(maps);

        // then
        assertEquals(result, 11);
    }
}