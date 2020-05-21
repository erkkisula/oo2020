public class Kuup extends Klots {
    double a;

    public Kuup(int a) {
        this.a = a;
    }

    @Override
    public double getPindala() {
        return 6*(a*a);
    }

}