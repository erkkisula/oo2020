import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ounakorvid {
    public static void main(String[] args) throws IOException {
        BufferedReader lugeja = new BufferedReader(new FileReader("jagasis.txt"));
        int N = Integer.parseInt(lugeja.readLine());  // mitu korvi
        String indeks = lugeja.readLine();
        List<Integer> korvid = new ArrayList<>();

        while(indeks != null){
            korvid.add(Integer.parseInt(indeks));
            indeks = lugeja.readLine();
        }
        lugeja.close();
        // System.out.println(N);
        // System.out.println(indeks);
        // System.out.println(korvid);
        int kokku = 0;

        for(int i = 0; i < N; i++){
            kokku = kokku + korvid.get(i);
        }

        int poolitaja = 1;
        int pooleks = kokku / 2;

        boolean lahendatud = false;

        while(lahendatud == false){
            int järgi = 0;
            for(int i = 0; i < poolitaja; i++){
                järgi = järgi + korvid.get(i);
            }
            if(järgi >= pooleks){
                if(Math.abs(kokku - 2* järgi) <= Math.abs(kokku - (2 * järgi) - (2 * korvid.get(poolitaja)))){
                    lahendatud = true;
                }else{
                    poolitaja--;
                    lahendatud = true;
                }
            }else{
                poolitaja++;
            }
        }
        BufferedWriter kirjanik = new BufferedWriter(new FileWriter("jagaval.txt"));
        kirjanik.write(Integer.toString(poolitaja));
        kirjanik.close();
    }
}