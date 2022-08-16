package roulette.main;

import roulette.*;

/**
 * Plays games of roulette until the player runs out of money.
 * 
 * @author Robert C. Duvall
 */
public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		Gambler player = new Gambler("Robert", 100);

		System.out.println("Hello " + player.getName() + ", let's play "
				+ game.getName());
		System.out.println();

		do {
			game.play(player);
		} while (player.isSolvent());

		System.out.println();
		System.out.println("Goodbye " + player.getName()
				+ ", thanks for playing!");
	}
}
