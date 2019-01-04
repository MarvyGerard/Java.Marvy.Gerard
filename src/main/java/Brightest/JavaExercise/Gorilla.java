package Brightest.JavaExercise;

public class Gorilla implements Animal {

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

    public Gorilla(String sound) {
        this.sound = sound;
    }

    public Gorilla(int attackDamage, int health, String sound) {
        this.attackDamage = attackDamage;
        this.health = health;
        this.sound = sound;

    }

}
