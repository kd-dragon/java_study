package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmPracticeTest {

    SortAlgorithmPractice sap = new SortAlgorithmPractice();

    @Test
    void smallestNumber() {
        //given
        int[] inputs = new int[]{4,3,2,1};

        //when
        int[] answer = sap.smallestNumber(inputs);

        for (int i : answer) {
            System.out.print(i + " ");
        }
        //then
        assertNotNull(answer);
        assertArrayEquals(answer, new int[]{4,3,2});
    }

    @Test
    void mySortString() {
        //given
        String[] strings = new String[]{"abce", "abcd", "cdx"};

        //when
        String[] answer = sap.mySortString(strings, 2);

        //then
        assertNotNull(answer);
        assertArrayEquals(answer, new String[]{"abcd", "abce", "cdx"});

    }

    @Test
    void toJadenCase() {
        //given
        String s = "3people   unFollowed  me ";

        //when
        String answer = sap.toJadenCase(s);

        //then
        assertNotNull(answer);
        assertEquals(answer, "3people   Unfollowed  Me ");
    }

    @Test
    void hIndex() {
        //given
        int[] citations = new int[]{3,0,6,1,5};

        //when
        int hindex = sap.hIndex(citations);

        //then
        assertEquals(hindex, 3);
    }
}