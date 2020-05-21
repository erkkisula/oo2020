public class Rakendus {
    public static void main(String[] args) throws Exception {
        
        // Sentimeetrid
        Klots k1 = new Kuup(400);
        Klots k2 = new RistTahukas(100, 225, 31);
        Klots k3 = new Kuup(724);
        Klots k4 = new RistTahukas(523, 120, 7);

        System.out.println("pind: " + k1.getPindala() + " cm^2 ; vajab värvi: " + k1.getPindala() * 0.00001666666 + " liitrit");
        System.out.println("pind: " + k2.getPindala() + " cm^2 ; vajab värvi: " + k2.getPindala() * 0.00001666666 + " liitrit");
        System.out.println("pind: " + k3.getPindala() + " cm^2 ; vajab värvi: " + k3.getPindala() * 0.00001666666 + " liitrit");
        System.out.println("pind: " + k4.getPindala() + " cm^2 ; vajab värvi: " + k4.getPindala() * 0.00001666666 + " liitrit");
    }
}
// 1 liiter = 60 000 cm^2 (0.5 = 30 000) (0.25 = 15 000) (0.125 == 7 500) (0.025 == 1 500)
// mitu liitrit? 
// kui 60 000 = 1 ja 30 000 = 0.5; siis kuidas leida, palju 20-le? 