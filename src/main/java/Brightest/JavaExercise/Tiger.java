package Brightest.JavaExercise;

public class Tiger implements Animal {

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

    public Tiger(String sound) {
        this.sound = sound;
    }

    public Tiger(int attackDamage, int health, String sound) {
        this.attackDamage = attackDamage;
        this.health = health;
        this.sound = sound;

    }

    public String getStatisticsAnimal() {
        return "Name: Tiger " + " Health: " + this.getHealth() + " AttackDamage: " + this.attackDamage();
    }

}
