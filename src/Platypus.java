public class Platypus extends Animal implements LayEggs, Shout, Run {

    @Override
    public void shout() {
        System.out.println("Platypus shouts!");
    }

    @Override
    public void run() {
        System.out.println("Platypus is running");
    }

    @Override
    public void layEggs() {
        System.out.println("Platypus is laying eggs");
    }
}
