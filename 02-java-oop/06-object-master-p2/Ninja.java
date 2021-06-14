public class Ninja extends Human{
    public Ninja(){
        super(3, 10, 3, 100);
    }
    public void steal(Human innocent){
        innocent.stealth -= this.stealth;
        this.stealth += innocent.stealth;
    }
    public void runaway(){
        this.health -= 10;
    }
}