public class Bird extends Animal implements Fly, LayEggs {

    public Bird() {
        
    }
    @Override
    public void fly() {
        System.out.println("Bird is flying like a boss.");
    }

    @Override
    public void layEggs() {
        System.out.println("Bird is laying eggs.");
    }
}
