public class HumanTest{
    public static void main(String[] args){

        Human fumie = new Ninja();
        Human reena = new Samurai();
        Human matt = new Wizard();

        fumie.attackHuman(reena);
        matt.attackHuman(fumie);
        reena.attackHuman(matt);
        System.out.println("Fumie's health level is " + fumie.health);
        System.out.println("Reena's health level is " + reena.health);
        System.out.println("Matt's health level is " + matt.health);
    }
}