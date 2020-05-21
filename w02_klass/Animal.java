public class Animal{

    private String species;
    private String name;
    private Gender gender;
    private Size size;
    private Type type;
    private Action action;

    public Animal(String species, String name, Gender gender, Size size, Type type, Action action){ // konstruktor'
        this.species = species;
        this.name = name;
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.action = action;
    }
    public Animal(){
        species = "Cat";
        name = "Miisu";
        gender = Gender.F;
        size = Size.L;
        type = Type.D;
        action = Action.A;
    }
    public String getSpecies(){
        return species;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        if(gender == Gender.M){
            return "Male";
        }else if(gender == Gender.F){
            return "Female";
        }else{
            return "Something else";
        }
    }
    public String getSize(){
        if(size == Size.B){
            return "Big";
        }else if(size == Size.M){
            return "Medium";
        }else if(size == Size.L){
            return "Little";
        }else{
            return "Something else";
        }
    }
    public String getType(){
        if(type == Type.D){
            return "House";
        }else if(type == Type.F){
            return "Farm";
        }else if(type == Type.W){
            return "Wild";
        }else{
            return "Something else";
        }
    }
    public String getAction(){
        if(action == Action.A){
            return "Meow Meow";
        }else if(action == Action.B){
            return "Woof Woof";
        }else if(action == Action.C){
            return "Oink Oink";
        }else if(action == Action.D){
            return "Roar Roar";
        }else{
            return "Something else";
        }
    }
}