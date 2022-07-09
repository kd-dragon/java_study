package stackqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQAlgorithmPracticeTest {

    SQAlgorithmPractice sqp = new SQAlgorithmPractice();

    @Test
    void correctParentheses() {
        //given
        String input = "(())()";

        //when
        boolean isOk = sqp.correctParentheses(input);

        //then
        assertTrue(isOk);
    }

    @Test
    void correctParenthesesInteger() {
        //given
        String input = "(())()";

        //when
        boolean isOk = sqp.correctParenthesesInteger(input);

        //then
        assertTrue(isOk);
    }

    @Test
    void funcDevelop() {
        //given
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};

        //when
        int[] outputs = sqp.funcDevelop(progresses, speeds);

        //then
        assertArrayEquals(outputs, new int[]{1,3,2});
    }

    @Test
    void funcDevelop2() {
        //given
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};

        //when
        int[] outputs = sqp.funcDevelop2(progresses, speeds);

        //then
        assertArrayEquals(outputs, new int[]{1,3,2});
    }

    @Test
    void priceStock() {
        //given
        int[] inputs = new int[]{1, 2, 3, 2, 3};

        //when
        int[] outputs = sqp.priceStock(inputs);

        //then
        assertArrayEquals(outputs, new int[]{4, 3, 1, 1, 0});
    }


    @Test
    void printingPriority() {
        //given
        int[] inputs = new int[]{1, 1, 9, 1, 1, 1};
        int location = 0;

        //when
        int output = sqp.printingPriority(inputs, location);

        //then
        assertEquals(output, 5);
    }



}