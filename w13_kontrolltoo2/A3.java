// package app;

public class A3{
    
    public static void main(String[] args) {
        
    
    
    final A1 A11 = new A1("H ", 1.0, 1); // vesinikioon
    final A1 A12 = new A1 ("NO ", 62.0049, -1); // nitraatioon

    int A11laeng = A11.getlaeng();
    double A11aatommass = A11.getaatommass();
    String A11nimetus = A11.getnimetus();


    int A12laeng = A12.getlaeng();
    double A12aatommass = A12.getaatommass();
    String A12nimetus = A12.getnimetus();

    String asdf = ("H" + "NO").toString();
    double aswq = A11aatommass + A12aatommass;
    int aqws = A11laeng + A12laeng;

    if(aqws == 0){
        A1 A13 = new A1(asdf, aswq, aqws);
        // A11nimetus + A12nimetus
        // System.out.println(A13.toString());
        // string Q = A13.toString();
        System.out.println(A13);
        System.out.println(A12);
        System.out.println(A11);
    }else{
        System.out.println("Need laengud ei ühti");
    }
    }
}
