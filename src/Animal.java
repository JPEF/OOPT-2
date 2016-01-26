public abstract class Animal {

    private boolean eaten;
    
    public Animal() {
        this.eaten = false;
    }
    
    public void eat() {
        if (this.eaten == true) {
            System.out.println("I have already eaten!");
        }
        else {
            this.eaten = true;
            System.out.println("MMMhhh that was delicious!");
        } 
    }
}
