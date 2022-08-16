/**
 * 
 */
package roulette;

/**
 * @author Jorge Soto-Ventura
 *
 */
public class ThreeConsecutiveNumbers extends Bet{
	private String betChoice;

	/**
	 * Constructs a bet with a given odds using the ThreeConsecutiveNumbers game.
	 * 
	 * @param description defines this as a 11 to 1 bet
	 * @param payout      payout given by the house for this kind of bet
	 */
	public ThreeConsecutiveNumbers(String description, int payout) {
		super(description, payout);
		
	}
	
	/**
	* Overrides placeBet to prompt user to pick the first of three consecutive numbers.
	*/
	
	@Override
	public void placeBet() {
		betChoice = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, 34);
		
	/**
	* Overrides betIsMade and returns whether the gambler's three consecutive numbers are on the board.
	*/
		
	}
	@Override
	public boolean betIsMade(Wheel myWheel, String choice) {
		//int start = Integer.parseInt(choice);
		int start1 = Integer.parseInt(betChoice);

		return (start1 <= myWheel.getNumber() && myWheel.getNumber() < start1 + 3);
			   //||(start <= myWheel.getNumber() && myWheel.getNumber() < start1 + 3);
	}
}
