/**
 * 
 */
package roulette;

/**
 * @author Jorge Soto-Ventura
 *
 */
public class SingleNumber extends Bet {
	private String betChoice;

	/**
	 * Constructs a bet with a given odds using a SingleNumber game.
	 * 
	 * @param description defines this as an 35 to 1 bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public SingleNumber(String description, int payout) {
		super(description, payout);
		
	}
	
	/**
	* Overrides placeBet and prompts the Gambler to choose a number between 1 and 36.
	*/
	@Override
	public void placeBet() {
		betChoice = "" + ConsoleReader.promptRange("Enter the number", 1, 36);		
		
	}
	
	/**
	* Overrides betIsMade and returns whether the Gambler's number was the same as the number on the wheel.
	*/
	@Override
	public boolean betIsMade(Wheel myWheel, String choice) {
		//int start = Integer.parseInt(choice);
		int start1 = Integer.parseInt(betChoice);
		return (start1 == myWheel.getNumber());
			   //|| (start == myWheel.getNumber());
	}
}
