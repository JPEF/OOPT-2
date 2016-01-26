public class Cage {
    
    private Animal animal;
    
    public Cage() {
        
    }
    public Cage(Animal animal) {
        this.animal = animal;
    }
    public void feed() {
        this.animal.eat();
    }
    public Animal getAnimal() {
        return this.animal;
    }

    
}
