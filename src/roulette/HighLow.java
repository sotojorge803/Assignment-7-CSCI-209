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
public class HighLow extends Bet{
	private String betChoice;

	/**
	 * Constructs a bet with a given odds using a High or Low game.
	 * 
	 * @param description defines this as an 1 to 1 bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public HighLow(String description, int payout) {
		super(description, payout);
	}
	
	/**
	* Overrides placeBet method and allows the gambler to choose between the options of high and low.
	*/
	@Override
	public void placeBet() {
		String result = "";
		Set<String> choices = new TreeSet<String>();
		choices.add("low");
		choices.add("high");
		betChoice = ConsoleReader.promptOneOf("Please bet", choices);
	}
	
	/**
	* Overrides betIsMade and returns whether the users bet is true or false based on whether the number is high or low.
	*/
	
	@Override
	public boolean betIsMade(Wheel myWheel, String choice) {
		return //myWheel.getNumber() >= 1 && myWheel.getNumber() <= 18 && choice.equals("low")
				myWheel.getNumber() >= 1 && myWheel.getNumber() <= 18 && betChoice.equals("low")
				//|| myWheel.getNumber() >= 19 && myWheel.getNumber()  <= 36 && choice.equals("high") 
				|| myWheel.getNumber() >= 19 && myWheel.getNumber()  <= 36 && betChoice.equals("high");

	}
}
