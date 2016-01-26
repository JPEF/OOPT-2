import java.util.ArrayList;

public class Zoo {

    private int numberOfCages;

    private ArrayList cages;
    
    private Cage cage;
    
    private Animal animal;
    
    public Zoo() {
        cages = new ArrayList();
        cage = new Cage();
    }
    
    public void feed() {
    }
    
    public void addCages(Cage c) {
        this.cages.add(c);
    }
    
    public Animal searchCage(int i) {
        cage = (Cage) this.cages.get(i);
        return cage.getAnimal();
    }
}
