public class Mammal{
    protected String species;
    protected int energy;
    public Mammal (String species, int energy){
        this.energy = energy;
        this.species = species;
    }
    public int displayEnergy(){
        System.out.println("Energy Level is: " + energy);
        return energy;
    }
    
}