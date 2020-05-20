package app;
// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class Testimine {
    // Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
    // Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);

    @Test
    public void testA(){
        // testimise test
        assertEquals(23.0, 231.0, 230.0);
    }
    @Test
    public void testB(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        assertEquals("Meevälja", Mõdu.getNimetus());
    }

    @Test
    public void testC(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        assertEquals(1.79 , Mõdu.getOmahind(), 1.0);
    }
    @Test
    public void testD(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        assertEquals(1.5, Mõdu.getErikaal(), 0.1);
    }
    @Test
    public void testE(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        assertEquals(Mõdu.getErikaal(), 1.5, 0.01);
    }
    
    // @

    @Test
    public void testF(){
        Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);
        assertEquals(1.5, Kaljapudel.getMaht(), 0.1);
    }

    @Test
    public void testG(){
        Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);
        assertEquals("Uhke klaaspudel", Kaljapudel.getPudelitüüp());
    }

    @Test
    public void testH(){
        Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);
        assertEquals(1.65, Kaljapudel.getMass(), 0.1);
    }
    @Test
    public void testI(){
        Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);
        assertEquals(0.15, Kaljapudel.getTaaraMaksumus(), 0.1);
    }
    
    @Test
    public void testJ(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        assertEquals(2.685, Mõdu.getIseHind(), 0.1);
    }
    
    @Test
    public void testK(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);
        assertEquals(2.84, Mõdu.getIseHind() + Kaljapudel.getTaaraMaksumus(), 0.1);
    }
    @Test
    public void testL(){
        Jook Mõdu = new Jook("Meevälja ", 1.79, 1.5);
        Joogipudel Kaljapudel = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);
        assertEquals(3.15, Mõdu.getErikaal() + Kaljapudel.getMass(), 0.1);
    }
}
