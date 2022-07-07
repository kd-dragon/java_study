package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingTestTest {

    private CodingTest ct = new CodingTest();

    @Test
    void find_max_index_array() {
        //given
        int[] inputs = new int[]{1,3,5,4,5,2,1};

        //when
        int[] outputs = ct.find_max_index_array(inputs);

        //then: [2,4]
        assertNotNull(outputs);
        assertArrayEquals(outputs, new int[]{2,4});
    }

    @Test
    void find_max_index_list() {
        //given
        int[] inputs = new int[]{1,3,5,4,5,2,1};

        //when
        int[] outputs = ct.find_max_index_array(inputs);

        //then: [2,4]
        assertNotNull(outputs);
        assertArrayEquals(outputs, new int[]{2,4});
    }

    @Test
    void permutation() {
        //given
        int[] inputs = new int[]{4,1,3,2};

        //when
        boolean retval = ct.permutation(inputs);

        //then: true
        assertTrue(retval);
    }

    @Test
    void reverse_natural_number() {
        //given
        long input = 12345;

        //when
        int[] outputs = ct.reverse_natural_number(input);

        //then: true
        assertNotNull(outputs);
        assertArrayEquals(outputs, new int[]{5,4,3,2,1});
    }
}