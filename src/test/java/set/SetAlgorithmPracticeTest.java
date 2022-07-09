package set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetAlgorithmPracticeTest {

    SetAlgorithmPractice sap = new SetAlgorithmPractice();


    @Test
    void validateLotto() {
        //given
        int[] inputs = new int[]{3, 19, 34, 39, 39, 20};

        //when
        boolean answer = sap.validateLotto(inputs);

        //then
        assertFalse(answer);

    }

    @Test
    void endTalk() {
        //given
        String[] inputs = new String[]{"tank", "kick", "know", "wheel", "land", "dream"};

        //when
        boolean answer = sap.endTalk(inputs);

        //then
        assertTrue(answer);
    }

    @Test
    void hateSameNumber() {
        //given
        int[] inputs = new int[]{1,1,3,3,0,1,1};

        //when
        int[] outputs = sap.hateSameNumber(inputs);

        //then
        assertNotNull(outputs);
        assertArrayEquals(outputs, new int[]{1,3,0,1});
    }
}