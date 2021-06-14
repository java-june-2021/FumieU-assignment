public class Samurai extends Human{
    public Samurai(){
        super(3, 3 ,3 ,200);
    }
    public void deathBlow(Human opponent){
        opponent.kill(opponent);
    }
    public void meditate(){
        this.health = this.health + (this.health/2);
    }
}

