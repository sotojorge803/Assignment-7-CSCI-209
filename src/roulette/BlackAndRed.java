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
public class BlackAndRed extends Bet{
	private String betChoice;
	/**
	 * Constructs a bet with a given odds that utilizes a Black or Red bet.
	 * 
	 * @param description defines this as a 1 to 1 bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public BlackAndRed(String description, int payout) {
		super(description, payout);
		
	/**
    * Overrides placeBet and allows the Gambler to choose between the colors Black or Red.
	*/
	}
	@Override
	public void placeBet() {
		String result = "";
		Set<String> choices = new TreeSet<String>();
		choices.add(Wheel.BLACK);
		choices.add(Wheel.RED);
		betChoice = ConsoleReader.promptOneOf("Please bet", choices);


	/**
	* Overrides betIsMade method and returns whether the gamblers choice is true or false based on the color selected.
	*/	
	}
	@Override
	public boolean betIsMade(Wheel myWheel, String choice) {
		return myWheel.getColor().equals(choice) || myWheel.getColor().equals(betChoice);
	}
}
