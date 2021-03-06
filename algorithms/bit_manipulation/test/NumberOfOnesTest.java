import algorithms.bit_manipulation.NumberOfOnes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfOnesTest {
    @Test
    public void test0() {
        int x = 0;
        int numOnes = NumberOfOnes.numberOfOnes(x);
        assertEquals(0, numOnes);
    }

    @Test
    public void test1() {
        int x = 7;
        int numOnes = NumberOfOnes.numberOfOnes(x);
        assertEquals(3, numOnes);
    }

    @Test
    public void test2() {
        int x = 19;
        int numOnes = NumberOfOnes.numberOfOnes(x);
        assertEquals(3, numOnes);
    }

    @Test
    public void test3() {
        int x = 127;
        int numOnes = NumberOfOnes.numberOfOnes(x);
        assertEquals(7, numOnes);
    }

    @Test
    public void test4() {
        int x = 79;
        int numOnes = NumberOfOnes.numberOfOnes(x);
        assertEquals(5, numOnes);
    }
}
