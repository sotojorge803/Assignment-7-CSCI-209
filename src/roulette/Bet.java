package roulette;

import java.util.Set;
import java.util.TreeSet;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {

	private String myDescription;
	private int myPayout;

	/**
	 * Constructs a bet with the given name and odds.
	 * 
	 * @param description name of this kind of bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public Bet(String description, int payout) {
		myDescription = description;
		myPayout = payout;
	}

	/**
	 * @return odds given by the house for this kind of bet
	 */
	public int getPayout() {
		return myPayout;
	}
	
	/**
	 * Constructs an abstract method for placing a bet
	 * @return abstract method
	 */
	public abstract void placeBet();
	
	/**
	 * Constructs an abstract method for bet is made
	 */
	
	public abstract boolean betIsMade(Wheel myWheel, String betChoice);

	/**
	 * @return name of this kind of bet
	 */
	public String getDescription() {
		return myDescription;
	}
	
	/**
	 * Place the given bet by prompting the user for the specific information
	 * need to complete the given bet.
	 * 
	 * @param whichBet
	 *            specific bet chosen by the user
	 */
}
