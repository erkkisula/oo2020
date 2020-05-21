package app;

public class App {
    public static void main(String[] args) {
        Jook Õlu = new Jook("Saaremaa X", 1.79, 1.5);
        Joogipudel SaaremaaXXX = new Joogipudel(1.5, "Uhke klaaspudel", 1.65, 0.15, true);

        System.out.println("");
        System.out.println("Jook: " + Õlu.getNimetus());
        System.out.println("Omahinnaga: " + Õlu.getOmahind() + " €");
        System.out.println("Erikaaluga: " + Õlu.getErikaal() + " kg");
        System.out.println("Asub pudelis mahuga: " + SaaremaaXXX.getMaht() + " liitrit");
        System.out.println("Pudel on: " + SaaremaaXXX.getPudelitüüp() + " tüüpi");
        System.out.println("Pudel ise on massiga: " + SaaremaaXXX.getMass() + " kg");
        System.out.println("Pudel on taarana väärt: " + SaaremaaXXX.getTaaraMaksumus() + " €");
        boolean a = SaaremaaXXX.getSeesOlevJook();

        if(a = true){
            System.out.println("Ja pudel on äärest ääreni head-paremat täis!!! HõissassaaaaAAAAA");
        }else if(a = false){
            System.out.println("Ja pudel on paraku tühi (noh praeguseks)");
        }else{
            System.out.println("Koodis võib midagi valesti olla");
        }

        System.out.println("Jook ise maksab: " + Õlu.getIseHind() + " €");
        
        if(a  =! false){
            double c = (Õlu.getErikaal() + SaaremaaXXX.getMass());
            System.out.println("Jook koos pudeliga kaalub: " + c + " kg");
        }else{
            System.out.println("Et pudel on ilma joogita, kaalub pudel: " + SaaremaaXXX.getMass() + " kg");
        }

        if(a  =! false){
            double d = Õlu.getIseHind() + SaaremaaXXX.getTaaraMaksumus();
            System.out.printf("Jook koos pudeliga maksab: %.2f €", d);
        }else{
            System.out.printf("Et pudel on ilma joogita, maksab pudel: %.2f €", SaaremaaXXX.getTaaraMaksumus());
        }
    }
}