package linearSearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinearSearchAlgorithmTest {

    LinearSearchAlgorithm lsam = new LinearSearchAlgorithm();

    @Test
    void phoneNumberList() {

        //given
        String[] inputs = new String[]{"119", "97674223", "1195524421"};

        //when
        boolean answer = lsam.phoneNumberList(inputs);

        //then
        assertFalse(answer);

    }

    @Test
    void pyCounting() {

        //given
        String input = "Pyy";

        //when
        boolean answer = lsam.pyCounting(input);

        //then
        assertFalse(answer);

    }

    @Test
    void skillTree() {

        //given
        String skill = "CBD";
        String[] skill_trees = new String[]{"BACDE", "CBADF", "AECB", "BDA"};

        //when
        int output = lsam.skillTree(skill, skill_trees);
        int output2 = lsam.skillTree2(skill, skill_trees);

        //then
        assertEquals(output, 2);
        assertEquals(output2, 2);
    }
}