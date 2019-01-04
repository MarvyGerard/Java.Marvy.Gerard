package Brightest.JavaExercise;

public class Wolf implements Animal {

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

    public Wolf(String sound) {
        this.sound = sound;
    }

    public Wolf(int attackDamage, int health, String sound) {
        this.attackDamage = attackDamage;
        this.health = health;
        this.sound = sound;

    }

    public String getStatisticsAnimal() {
        return "Name: Wolf "  + " Health: " + this.getHealth() + " AttackDamage: " + this.attackDamage();
    }
}
