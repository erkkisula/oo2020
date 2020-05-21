package app;
public class Jook {
    String nimetus;
    double omahind;
    double erikaal;
    public Jook(String nimetus, double omahind, double erikaal){
        this.nimetus = nimetus;
        this.omahind = omahind;     // hind liitri kohta
        this.erikaal = erikaal;     // mitu liitrit on jooki
    }
    // @Override
    public String getNimetus(){
        return nimetus;
    }
    // @Override
    public double getOmahind(){
        return omahind;
    }
    // @Override
    public double getErikaal(){
        return erikaal;
    }
    // @Override
    public double getIseHind(){     // palju maksab jook ise
        return (omahind * erikaal);
    }
}