import java.util.Scanner;

public class cookie{
    public static Scanner INS = new Scanner(System.in);
    public static void main (String[] args){
        int pikkus, laius, kõrgus, küpsisedPakis;

        System.out.println("\nPalun sisesta pikkus: ");
        pikkus = INS.nextInt();
        System.out.println("Palun sisesta laius: ");
        laius = INS.nextInt();
        System.out.println("Palun sisesta kõrgus: ");
        kõrgus = INS.nextInt();
        System.out.println("Palun sisesta, mitu küpsist on ühes pakis: ");
        küpsisedPakis = INS.nextInt();

        meetod(pikkus, laius, kõrgus, küpsisedPakis);
    }

    public static void meetod (int a,int b,int c,int d){
        int vastus, jääk, pakkeVajaInt;
        double pakkeVajaDouble, vastusDouble, dDouble;
        vastus = a*b*c;
        pakkeVajaInt = vastus / d; 

        vastusDouble = (double)vastus;
        dDouble = (double)d;
        pakkeVajaDouble = vastusDouble / dDouble; 

        if(pakkeVajaDouble > pakkeVajaInt){
            pakkeVajaInt = pakkeVajaInt + 1;
        }
        else if(pakkeVajaInt == 0){
            pakkeVajaInt = 1;
        }

        jääk = (pakkeVajaInt * d)-vastus;

        System.out.println("\nSee tort koosneks "+ vastus +" küpsisest, mis vajaks "+ pakkeVajaInt +" küpsisepakki. \n");
        if(jääk > 0){
            System.out.println("Üle jääks "+ jääk +" küpsist. \n");
        }
        else{
            System.out.println("Küpsiseid üle ei jääks");
        }

    }
}