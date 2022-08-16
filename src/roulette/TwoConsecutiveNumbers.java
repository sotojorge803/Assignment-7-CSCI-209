/**
 * 
 */
package roulette;

/**
 * @author Jorge Soto-Ventura
 *
 */
public class TwoConsecutiveNumbers extends Bet{
	private String betChoice;


	/**
	 * Constructs a bet with a given odds using the TwoConsecutiveNumbers game.
	 * 
	 * @param description defines this as a 17 to 1 bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public TwoConsecutiveNumbers(String description, int payout) {
		super(description, payout);
	}
	
	/**
	* Overrides placeBet and prompts the user to pick the first of two consecutive numbers.
	*/
	
	@Override
	public void placeBet() {
		betChoice = "" + ConsoleReader.promptRange("Enter first of two consecutive numbers", 1, 35);		
		
	}
	
	/**
	* Overrides betIsMade and returns whether the gambler's two consecutive numbers are on the board.
	*/
	
	@Override
	public boolean betIsMade(Wheel myWheel, String choice) {
		//int start = Integer.parseInt(choice);
		int start1 = Integer.parseInt(betChoice);

		return (start1 <= myWheel.getNumber() && myWheel.getNumber() < start1 + 2) ;
			   //|| (start <= myWheel.getNumber() && myWheel.getNumber() < start1 + 2);
	}

}
