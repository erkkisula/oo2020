// package app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestKlass {
    A1 A11 = new A1("H", 1.0, 1); // vesinikioon
    A1 A12 = new A1 ("NO", 62.0049, -1); // nitraatioon
    // A1 A13 = new A1("H", 1.0, 1); // vesinikioon
    // A1 A14 = new A1 ("NO", 62.0049, -1); // nitraatioon
    
    @Test
    public void testA(){
        assertEquals("H", A11.getlaeng());
    }
    @Test
    public void testB(){
        assertEquals("NO", A12.getnimetus());
    }
    // @Test
    // public void testC(){
    //     assertEquals("NO", 1, A13.getlaeng());
    // }
    // @Test
    // public void testD(){
    //     assertEquals("H", A14.getnimetus());
    // }
}