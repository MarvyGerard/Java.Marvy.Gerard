package Brightest.JavaExercise;

public class Warrior {

	private int health = 200;
	private int attackDamage = 15;
	private String name;


	public Warrior(String weaponChoice, int attackOrDefenseChoice, String name) {
		if (attackOrDefenseChoice == 1) {
			this.setAttackDamage(this.getAttackDamage() + 10);
		}

		if (attackOrDefenseChoice == 2) {
			this.setHealth(this.getHealth() + 50);
			// TODO 2. We will add 50 health points if the player has chosen for the defense = DONE
			// choice
		}
		this.setName(name);

	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	//public String getweapon() {
	//	this.weapon = weapon;
	//}

	public String getStatistics() {
		return "Name: " + this.getName() + " Health: " + this.getHealth() + " AttackDamage: " + this.getAttackDamage();
	}

}
