package Brightest.JavaExercise;

public class Hyenas implements Animal {

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

    public Hyenas(String sound) {
        this.sound = sound;
    }

    public Hyenas(int attackDamage, int health, String sound) {
        this.attackDamage = attackDamage;
        this.health = health;
        this.sound = sound;

    }

    public String getStatisticsAnimal() {
        return "Name: Hyenas " + " Health: " + this.getHealth() + " AttackDamage: " + this.attackDamage();
    }
}
