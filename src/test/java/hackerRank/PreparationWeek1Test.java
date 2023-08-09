package hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PreparationWeek1Test {
    PreparationWeek1 preparationWeek1 = new PreparationWeek1();
    @Test
    void timeConversion() {
        String result = preparationWeek1.timeConversion("12:40:22AM");
        assertEquals(result, "00:40:22");
    }

    @Test
    void matchingStrings() {
        List<Integer> result = preparationWeek1.matchingStrings(
                new LinkedList<>(List.of("ab","ab", "abc")),
                new LinkedList<>(List.of("ab", "abc", "bc")));
        assertArrayEquals(result.stream().mapToInt(n -> n).toArray(), new int[]{2,1,0});
    }

    @Test
    void lonelyInteger() {
        int result = preparationWeek1.lonelyInteger(new LinkedList<>(List.of(1,2,3,4,3,2,1)));
        assertEquals(result, 4);
    }

    @Test
    void flippingBits() {
        long result = preparationWeek1.flippingBits(9);
        assertEquals(result, 4294967286L);
    }

    @Test
    void diagonalDifference() {
        List<List<Integer>> input = new LinkedList<>();
        input.add(new LinkedList<>(List.of(11,2,4)));
        input.add(new LinkedList<>(List.of(4,5,6)));
        input.add(new LinkedList<>(List.of(10,8,-12)));
        int result = preparationWeek1.diagonalDifference(input);

        assertEquals(result, 15);
    }

    @Test
    void countingSort() {
        List<Integer> arr = new LinkedList<>(List.of(63,25,73,1,98,73,56,84,86,57,16,83,8,25,81,56,9,53,98,67,99,12,83,89,80,91,39,86,76,85,74,39,25,90,59,10,94,32,44,3,89,30,27,79,46,96,27,32,18,21,92,69,81,40,40,34,68,78,24,87,42,69,23,41,78,22,6,90,99,89,50,30,20,1,43,3,70,95,33,46,44,9,69,48,33,60,65,16,82,67,61,32,21,79,75,75,13,87,70,33));
        List<Integer> result = preparationWeek1.countingSort(arr);
        assertArrayEquals(result.stream().mapToInt(n->n).toArray(),
                new int[]{0,2,0,2,0,0,1,0,1,2,1,0,1,1,0,0,2,0,1,0,1,2,1,1,1,3,0,2,0,0,2,0,3,3,1,0,0,0,0,2,2,1,1,1,2,0,2,0,1,0,1,0,0,1,0,0,2,1,0,1,1,1,0,1,0,1,0,2,1,3,2,0,0,2,1,2,1,0,2,2,1,2,1,2,1,1,2,2,0,3,2,1,1,0,1,1,1,0,2,2});
    }

    @Test
    void pangrams() {
        String input = "The quick brown fox jumps over the lazy dog";
        String result = preparationWeek1.pangrams(input);

        assertEquals(result, "pangram");
    }

    @Test
    void twoArrays() {
        int k = 1;
        List<Integer> A = new ArrayList<>(Arrays.asList(1,2,2,1));
        List<Integer> B = new ArrayList<>(Arrays.asList(3,3,3,4));
        String result = preparationWeek1.twoArrays(k, A, B);

        assertEquals(result, "NO");
    }
}