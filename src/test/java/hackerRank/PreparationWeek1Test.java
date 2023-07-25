package hackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreparationWeek1Test {

    @Test
    void plusMinus() {
        PreparationWeek1 plusMinus = new PreparationWeek1();
        double[] result = plusMinus.plusMinus(new ArrayList<>(List.of(-4, 3, -9, 0, 4, 1)));

        assertArrayEquals(result, new double[]{0.500000, 0.333333, 0.166667});
    }

    @Test
    void miniMaxSum() {
        PreparationWeek1 pw = new PreparationWeek1();
        long[] result = pw.miniMaxSum(new ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625)));

        assertArrayEquals(result, new long[]{2063136757L, 2744467344L});
    }
}