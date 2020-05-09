public class RAK {
// loob objektid, mis seejärel töödeldakse

    public static void main(String[] args) {
            
        KO objekt = new KO();

        AN uus = new AN(12, 15, 4, JOOK.mõdu);
        AN uus1 = new AN(19, 2, 5, JOOK.õlu);
        AN uus2 = new AN(17, 6, 2, JOOK.vein);
        AN uus3 = new AN(15, 1, 4, JOOK.siider);
        AN uus4 = new AN(4, 5, 1, JOOK.mõdu);
        AN uus5 = new AN(1, 5, 2, JOOK.vein);

        objekt.lisa(uus);
        objekt.lisa(uus1);
        objekt.lisa(uus2);
        objekt.lisa(uus3);
        objekt.lisa(uus4);
        objekt.lisa(uus5);

        objekt.nimekiri();
    }
}
    