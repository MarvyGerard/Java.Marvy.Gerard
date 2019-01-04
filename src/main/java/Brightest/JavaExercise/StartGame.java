package Brightest.JavaExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StartGame {

	private static String playerName;
	private static int selectedMode;
	private static String weapon;

	public static void main(String[] args) {

		// Let the player enter his name
		System.out.println("Welcome player! Please enter your name: ");
		ConsoleRead cons = new ConsoleRead();
		playerName = cons.scanString();

		// Select player mode
		System.out.println("Welcome " + playerName
				+ "! Please select the mode you want for your warrior: Press '1' for attack, '2' for defense. ");
		selectedMode = cons.scanInteger();
		while (selectedMode != 1 && selectedMode != 2) {
			System.err.println("Selected mode not supported!");
			selectedMode = cons.scanInteger();
		}

		// Enter weapon of choice
		System.out.println(playerName + " Choose your weapon: axe,sword or mace");
		ConsoleRead cons1 = new ConsoleRead();
		weapon = cons1.scanString();
		// TODO 1. Let the player enter a weapon and print this weapon in the players
		// statistics

		// create new Warrior object
		Warrior player = new Warrior(weapon, selectedMode, playerName);

		// Print newly created players statistics
		System.out.println("Following player created: " + player.getStatistics());

		// Create a new list with animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Bear("roar"));
		animals.add(new Bear(20, 100, "growl"));
		animals.add(new Wolf(40,50, "Howl"));
		// TODO 3. Add a wolf to the list with health 50 and attack damage 40
		// TODO 4. Add a Hyenas with health 80 and damage 25 and as sound a 'laugh'
		// TODO 5. Add an animal of your choice with standard animal health and standard
		// damage and a sound you can choose freely
		// TODO 6. Add your own animal

		// Shuffle the list randomly
		Collections.shuffle(animals);

		// Create an iterator, for each animal present in the list there will be a
		// fight, at the end of the fight, the player can select to add health or to add
		// more attackDamage
		Iterator<Animal> animalsIterator = animals.iterator();
		while (animalsIterator.hasNext()) {
			Animal nextAnimal = animalsIterator.next();
			while (nextAnimal.getHealth() > 0 && player.getHealth() > 0) {

				// Collect player and animal stats and calculate result
				int playerAttack = player.getAttackDamage();
				int animalAttack = nextAnimal.attackDamage();
				int playerHealth = player.getHealth() - animalAttack;
				int animalHealth = nextAnimal.getHealth() - playerAttack;

				System.out.println();
				System.out.println("The animal makes a " + nextAnimal.animalSound().toUpperCase()
						+ " sound and strikes with an attack of " + nextAnimal.attackDamage());
				System.out
						.println(player.getName() + " attack the animal with " + player.getAttackDamage() + " damage");

				// Write results to the animal and player
				player.setHealth(playerHealth);
				nextAnimal.setHealth(animalHealth);

				System.out.println();
				System.out.println("Player statistics: " + player.getStatistics());
				// TODO 7. Get and print the statistics form the animal -
				// System.out.println("Animal statistics: ");
			}

			// TODO 8. If the animal is defeated, let the player choose if he want to add
			// health or attack damage and write the new values to the player
		}

		// Close scanner
		cons.close();

	}
}
