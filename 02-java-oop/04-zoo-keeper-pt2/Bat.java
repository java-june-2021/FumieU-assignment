public class Bat extends Mammal{

	public Bat() {
		super("Bat",300);
	}
	public void fly() {
		System.out.println("flatter-flatter");
		this.energy -= 50;
	}
	public void eatHumans() {
		System.out.println("Ummm, yummy!");
		this.energy += 25;
	}
	public void attackTown() {
		System.out.println("Fire!");
		this.energy -= 100;
	}
	

}