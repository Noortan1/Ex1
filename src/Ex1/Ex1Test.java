package Ex1;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    public void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    public void isBasisNumberTest() {
        String[] good = { "1", "1b2", "01b2", "123bA", "ABbG", "0bA" };
        for (int i = 0; i < good.length; i = i + 1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = { "b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2" };
        for (int i = 0; i < not_good.length; i = i + 1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }





    @Test
    public void maxIndexTest() {
        // implement this test
        assertEquals( ,Ex1.maxIndex("1b","101b2","7BbG"));
        assertEquals(5 ,Ex1.maxIndex("101b2"));
        assertEquals(5 ,Ex1.maxIndex("101b2"));
        assertEquals(5 ,Ex1.maxIndex("101b2"));

    }

    @Test
    public void number2IntTest() {
        assertEquals(5 ,Ex1.number2Int("101b2"));
        assertEquals(-1 ,Ex1.number2Int("0bA"));
        assertEquals(5 ,Ex1.number2Int("b1"));
        assertEquals(123 ,Ex1.number2Int("123"));
    }

    @Test
    public void isNumberTest() {

    }

    @Test
    public void int2Number() {

        }
    }

    // Add additional test functions - test as much as you can.
}
