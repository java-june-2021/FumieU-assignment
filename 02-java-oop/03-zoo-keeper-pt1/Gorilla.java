public class Gorilla extends Mammal{
    public Gorilla(){
        super("Gorilla", 100);
    }
    public void throwSomething(){
        this.energy -= 5;

    } 
    public void eatBananas(){
        this.energy += 10;

    } 
    public void climb(){
        this.energy -= 10;

    }
    
}