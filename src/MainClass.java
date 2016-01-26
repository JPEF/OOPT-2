public class MainClass {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        
        Bird bird = new Bird();
        Griffin griffin = new Griffin();
        Horse horse = new Horse();
        Pegasus pegasus = new Pegasus();
        Platypus platypus = new Platypus();
        
        Cage cage1 = new Cage(bird);
        Cage cage2 = new Cage(griffin);
        Cage cage3 = new Cage(horse);
        Cage cage4 = new Cage(pegasus);
        Cage cage5 = new Cage(platypus);
       
        zoo.addCages(cage1);
        zoo.addCages(cage2);
        zoo.addCages(cage3);
        zoo.addCages(cage4);
        zoo.addCages(cage5);
       
        System.out.println(zoo.searchCage(0).getClass());
        
        zoo.searchCage(1);
        zoo.searchCage(2);
        zoo.searchCage(3);
        zoo.searchCage(4);
    }

}
