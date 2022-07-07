package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListPracticeTest {

    LinkedListPractice p = new LinkedListPractice();

    @Test
    void integerPractice() {
        assertNotNull(p.integerPractice());
    }

    @Test
    void objectPractice() {
        assertTrue(p.objectPractice());
    }

    @Test
    void vectorPractice() {
        assertTrue(p.listVectorPractice());
    }
}