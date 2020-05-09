import java.util.List;
import java.util.ArrayList;

public class KO {
    private final List<AN> objekt = new ArrayList<>(); // loob massiivi

    public void lisa(final AN näide){ // lisab massiivi parameetrina toodud näite
        objekt.add(näide);
    }

    public void nimekiri(){
        for(int i=0; i<objekt.size();i++){
            System.out.println("kaup nr. " + (i + 1) + ": " + objekt.get(i).getVastus());
        }
    }
}