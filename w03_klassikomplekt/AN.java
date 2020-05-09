public class AN {
    private double a;
    private double b;
    private double c;  
    private JOOK jook;
    
    public AN(double a, double b, double c, JOOK jook){
        this.a = a;
        this.b = b;
        this.c = c;
        this.jook = jook;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public void getJookEnum() {
        String set;
        switch (jook){
            case vein:
            set = "vein";
            break;
    
            case õlu:
            set ="õlu";
            break;
    
            case siider:
            set = "siider";
            break;

            case mõdu:
            set = "mõdu";
            break;
    
            default:
            set = "tühjaks joodud";
            break;
        }
    }

    public JOOK getJook(){
        return jook;
    }
    public double getRuumala(){
        return (a*b*c);
    }
    public String getVastus(){
        return "Mahuti on " + getRuumala() + " kuupmeetrit, kaubaks on " + getJook();
    }
}
