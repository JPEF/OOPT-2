public class Griffin extends Animal implements Shout, Run, Fly {

    @Override
    public void run() {
        System.out.println("Griffin is running around");
    }

    @Override
    public void shout() {
        System.out.println("Griffin is shouting");
    }

    @Override
    public void fly() {
        System.out.println("Griffin is flying around");
    }
}
