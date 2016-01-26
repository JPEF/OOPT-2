public class Pegasus extends Animal implements Fly, Run {

    @Override
    public void run() {
        System.out.println("Pegasus is running");
    }

    @Override
    public void fly() {
        System.out.println("Pegasus is flying");
    }
    
    
}
