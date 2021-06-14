public class HumanTest{
    public static void main(String[] args){

        Human fumie = new Ninja();
        Human reena = new Samurai();    
        Human matt = new Wizard();
        reena.kill(fumie);
        fumie.attackHuman(reena);
        matt.attackHuman(fumie);

        Ninja kanzo = new Ninja();
        kanzo.steal(reena);
        kanzo.runaway();

        Samurai oda = new Samurai();
        oda.deathBlow(kanzo);    
        oda.meditate();

        Wizard karen = new Wizard();
        karen.fireball(oda);
        karen.healHuman(kanzo);

        System.out.println("Fumie's health is now: " + fumie.health);
        System.out.println("Reena's health is now: " + reena.health);
        System.out.println("Kanzo's health is now: " + kanzo.health);
        System.out.println("Oda's health is now: " + oda.health);
        System.out.println("Karen's health is now: " + karen.health);
        
    }
}