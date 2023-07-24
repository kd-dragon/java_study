package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeAlgorithmPracticeTest {

    @Test
    void moreSpicy() {
        TreeAlgorithmPractice treeAlgorithmPractice = new TreeAlgorithmPractice();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int result = treeAlgorithmPractice.moreSpicy(scoville, K);
        assertEquals(2, result);
    }
}