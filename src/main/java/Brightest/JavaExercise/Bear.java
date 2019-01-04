package Brightest.JavaExercise;

public class Bear implements Animal {

	private int attackDamage = Animal.stdAttack;
	private int health = Animal.stdHealth;
	private String sound;

	public int attackDamage() {
		return attackDamage;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public String animalSound() {
		return sound;
	}

	public Bear(String sound) {
		this.sound = sound;
	}

	public Bear(int attackDamage, int health, String sound) {
		this.attackDamage = attackDamage;
		this.health = health;
		this.sound = sound;

	}

	public String getStatisticsAnimal() {
		return "Name: Bear " + " Health: " + this.getHealth() + " AttackDamage: " + this.attackDamage();
	}
}
