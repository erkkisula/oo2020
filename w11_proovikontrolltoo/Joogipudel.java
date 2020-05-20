package app;
public class Joogipudel {
    double maht;
    String pudelitüüp;
    double mass;
    double taaraMaksumus;
    boolean seesOlevJook;
    Jook jook;
    public Joogipudel(double maht, String pudelitüüp, double mass, double taaraMaksumus, boolean seesOlevJook){
        this.maht = maht;
        this.pudelitüüp = pudelitüüp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
        this.seesOlevJook = seesOlevJook;
    }
    // @Override 
    public double getMaht(){
        return maht;
    }
    // @Override 
    public String getPudelitüüp(){
        return pudelitüüp;
    }
    // @Override 
    public double getMass(){
        return mass;
    }
    // @Override 
    public double getTaaraMaksumus(){
        return taaraMaksumus;
    }
    // @Override 
    public boolean getSeesOlevJook(){
        return seesOlevJook;
    }
}