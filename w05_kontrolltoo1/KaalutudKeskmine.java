// niisiis, funktsioon loeb failist : 
// 	1. nimed:
// 	2. kahe aine hinded (A-F)
// 	3. ainepunktid 
// 	
// 	mõlemale leitakse kaalutud keskmine
	
// 	funktsioonis peab juba ette olema antud kahe aine hinded ja punktid

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class KaalutudKeskmine {

    public static void main(String[] args) throws IOException {
        List<String> people = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("andmed.txt"));

        String line = reader.readLine();

        while(line != null){
			// System.out.println(line);
            people.add(line);
			line = reader.readLine();
		}
		String StringA = "A";
		String StringB = "B";
		String StringC = "C";
		String StringD = "D";
		String StringE = "E";
		// String a;
		// String b;
		// int hinne1 = 0;
		// int hinne2 = 0;
		// int c = 0;
		// int d = 0;
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for(int i = 0; i < people.size(); i++){
			String[] lineContent = people.get(i).split(",");
			String line1 = (lineContent[0] + "     " + lineContent[1]+ " ... ");
			String a = lineContent[2];
			String b = lineContent[3];
			// int c = Integer.parseInt(lineContent[4]);
			// int d = Integer.parseInt(lineContent[5]);
			int hinne1;
			int hinne2;
			if(a.equals(StringA)){
				hinne1 = 5;
			}else if(a.equals(StringB)){
				hinne1 = 4;
			}else if(a.equals(StringC)){
				hinne1 = 3;
			}else if(a.equals(StringD)){
				hinne1 = 2;
			}else if(a.equals(StringE)){
				hinne1 = 1;
			}else{
				hinne1 = 0;
			}
			if(b.equals(StringA)){
				hinne2 = 5;
			}else if(b.equals(StringB)){
				hinne2 = 4;
			}else if(b.equals(StringC)){
				hinne2 = 3;
			}else if(b.equals(StringD)){
				hinne2 = 2;
			}else if(b.equals(StringE)){
				hinne2 = 1;
			}else{
				hinne2 = 0;
			}
			int c = Integer.parseInt(lineContent[4]);
			int d = Integer.parseInt(lineContent[5]);
			double DoubleC = c;
			double DoubleD = d;

			Double KK = (((hinne1 * DoubleC) + (hinne2 * DoubleD)) / (DoubleC + DoubleD));  

			System.out.println(KK); // kaalutud keskmine
			System.out.println("---------------------");
			String KKK = Double.toString(KK);
			writer.write(line1);
			writer.write(KKK);
        	writer.close();

        }
    }
}