public class Wizard extends Human{
    public Wizard(){
        super(3, 3, 8, 50);
    }
    public int healHuman(Human damaged){
        damaged.health = damaged.health + this.intelligence;
        return damaged.health;
    }
    public void fireball(Human other){
        other.health = other.health - (this.intelligence * 3);
    }
}