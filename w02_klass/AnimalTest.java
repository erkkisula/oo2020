public class AnimalTest{
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", "Nuki", Gender.M, Size.L, Type.D, Action.B);
        Animal animal2 = new Animal("Cat", "Miisu", Gender.F, Size.L, Type.D, Action.A);
        Animal animal3 = new Animal("Pig", "Notsu", Gender.M, Size.L, Type.F, Action.C);
        Animal animal4 = new Animal("Bear", "Puhh", Gender.M, Size.L, Type.W, Action.D);

        Animal[] animals = {animal1, animal2, animal3, animal4};

        for(int i = 0; i < animals.length; i++){
            System.out.print(animals[i].getSpecies()+" ");
            System.out.print(animals[i].getName()+" ");
            System.out.print(animals[i].getGender()+" ");
            System.out.print(animals[i].getSize()+" ");
            System.out.print(animals[i].getType()+" ");
            System.out.println();
            System.out.println(animals[i].getAction()+" ");
        }
    }
}