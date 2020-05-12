public class RistTahukas extends Klots {
    double a;
    double b;
    double c;

    public RistTahukas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPindala() {
        return 2*((a*b)+(b*c)+(c*a));
    }

}
