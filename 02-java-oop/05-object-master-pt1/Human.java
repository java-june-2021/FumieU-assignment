public class Human{
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    public Human (int strength, int stealth, int intelligence, int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }   
    public int attackHuman(Human enemy){
        enemy.health = enemy.health - this.strength;
        return enemy.health;
    }
    
}