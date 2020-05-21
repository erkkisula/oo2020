// package app;

// objekt

public class A1 {
    // implements A2
    
    private String nimetus;
    private double aatommass;
    private int laeng;

    public A1(String nimetus, double aatommass, int laeng) {

        this.nimetus = nimetus;
        this.aatommass = aatommass;
        this.laeng = laeng;
        }

    // testimise eesmärgil

    @Override
    public String getnimetus() {
        return nimetus;
    }
    @Override
    public double getaatommass() {
        return aatommass;
    }
    @Override
    public int getlaeng(){
        return laeng;
    }       
}
