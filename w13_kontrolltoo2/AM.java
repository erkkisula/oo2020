public class AM {
    public static void main(String[] arg){
        AL esimene = new AF();
        System.out.println(esimene.nimetus("vesinikioon"));
        System.out.println(esimene.aatommassideSumma(1.007276470));
        System.out.println(esimene.laeng(1));
        System.out.println();
        System.out.println(esimene.nimetus("nitraatioon"));
        System.out.println(esimene.aatommassideSumma(62.0049));
        System.out.println(esimene.laeng(-1));
    }
}