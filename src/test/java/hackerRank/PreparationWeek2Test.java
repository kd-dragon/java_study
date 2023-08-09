package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreparationWeek2Test {

    @Test
    void sockMerchant() {
        PreparationWeek2 pw2 = new PreparationWeek2();
        List<Integer> ar = List.of(1, 2, 1, 2, 1, 3, 2);
        int result = pw2.sockMerchant(7, ar);
        assertEquals(result, 2);
    }

    @Test
    void findZigZagSequence() {
        PreparationWeek2 pw = new PreparationWeek2();
        int[] a = new int[]{2,3,5,1,4};
        int n = 5;

        // 1 2 3 4 5
        // 1 2 5 4 3
        //

        pw.findZigZagSequence(a, n);
    }
}