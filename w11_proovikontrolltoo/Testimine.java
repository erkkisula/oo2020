// package app;
// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class Testimine {
    Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
    Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);

    @Test
    public void testA(){
        // testimise test
        assertEquals(23.0, 231.0, 230.0);
    }
    @Test
    public void testB(){
        assertEquals("Meevälja ", Mõdu.getNimetus());
    }

    @Test
    public void testC(){
        assertEquals(1.79 , Mõdu.getOmahind(), 1.0);
    }
    @Test
    public void testD(){
        assertEquals(1.5, Mõdu.getErikaal(), 0.1);
    }
    @Test
    public void testE(){
        assertEquals(Mõdu.getErikaal(), 1.5, 0.01);
    }
    
    //@

    @Test
    public void testF(){
        assertEquals(1.5, Kaljapudel.getMaht(), 0.1);
    }

    // @Test
    // public void testG(){
    //     assertEquals("Uhke klaaspudel", Kaljapudel.getPudelitüüp());
    // }

    @Test
    public void testH(){
        assertEquals(1.65, Kaljapudel.getMass(), 0.1);
    }
    @Test
    public void testI(){
        assertEquals(0.15, Kaljapudel.getTaaraMaksumus(), 0.1);
    }
    //
    @Test
    public void testJ(){
        assertEquals(2.685, Mõdu.getIseHind(), 0.1);
    }
    @Test
    public void testK(){
        assertEquals(2.84, Mõdu.getIseHind() + Kaljapudel.getTaaraMaksumus(), 0.1);
    }
    @Test
    public void testL(){
        assertEquals(3.15, Mõdu.getErikaal() + Kaljapudel.getMass(), 0.1);
    }
}