package Brightest.JavaExercise;

import java.util.Scanner;

public class ConsoleRead {

	Scanner s;

	public ConsoleRead() {
		s = new Scanner(System.in);
	}

	public String scanString() {
		String input;
		input = s.nextLine();
		return input;
	}

	public int scanInteger() {
		int input;
		input = s.nextInt();
		return input;
	}

	public void close() {
		s.close();
	}

}
