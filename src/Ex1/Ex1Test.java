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
        assertEquals(2 ,Ex1.maxIndex(new String [] {"1b","101b2","7BbG"}));
        assertEquals(2 ,Ex1.maxIndex(new String[] {"101b2","7Ab16","261b8"}));
        assertEquals(1 ,Ex1.maxIndex(new String[]{"101b2","222","261b8"}));

    }

    @Test
    public void number2IntTest() {
        assertEquals(5 ,Ex1.number2Int("101b2"));
        assertEquals(11 ,Ex1.number2Int("BbG"));
        assertEquals(55 ,Ex1.number2Int("67b8"));
        assertEquals(1 ,Ex1.number2Int("1"));
    }

    @Test
    public void isNumberTest() {
        assertEquals(true ,Ex1.isNumber("101b2"));
        assertEquals(true ,Ex1.isNumber("7BbG"));
        assertEquals(false ,Ex1.isNumber(""));
        assertEquals(false ,Ex1.isNumber("b1"));



    }

    @Test
    public void int2NumberTest() {
        assertEquals("FbG" ,Ex1.int2Number(15,16));
        assertEquals("1010b2" ,Ex1.int2Number(10, 2));
        assertEquals("10000b2" ,Ex1.int2Number(16 , 2));
        assertEquals("25b8" ,Ex1.int2Number(21 , 8));


    }
    @Test
    public void equalsTest(){
        assertEquals(false ,Ex1.equals("101b2" ,"100b2"));
        assertEquals(false ,Ex1.equals("FbG" ,"100b2"));
        assertEquals(true ,Ex1.equals("100b2" ,"100b2"));
        assertEquals(true ,Ex1.equals("10100b2" ,"20bA"));


    }

    // Add additional test functions - test as much as you can.
}
