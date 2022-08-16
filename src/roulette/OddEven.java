/**
 * 
 */
package roulette;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Jorge Soto-Ventura
 *
 */
public class OddEven extends Bet {
	private String betChoice;

	/**
	 * Constructs a bet with a given odds using a Odd or Even game.
	 * 
	 * @param description defines this as an 1 to 1 bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public OddEven(String description, int payout) {
		super(description, payout);
	}
	
	/**
	 * Override the placeBet method and providing the chocies of even and odd 
	 */
	
	@Override
	public void placeBet() {
		String result = "";
		Set<String> choices = new TreeSet<String>();
		choices.add("even");
		choices.add("odd");
		betChoice = ConsoleReader.promptOneOf("Please bet", choices);
	}
	
	/**
	 * Override the betIsMade method and return true or false based on whether the gambler bet even or odd and what the wheel landed on.
	 */
	
	@Override
	public boolean betIsMade(Wheel myWheel, String choice) {
		return //(myWheel.getNumber() % 2 == 0 && choice.equals("even")
			   (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) 
			   //(myWheel.getNumber() % 2 == 1 && choice.equals("odd"))
			   || (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
