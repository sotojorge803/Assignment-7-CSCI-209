/**
 * 
 */
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.BlackAndRed;
import roulette.Wheel;
import roulette.Game;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class BlackAndRedTest {
	
	private BlackAndRed BlackandRed;
	
	@BeforeEach
	void setUp() throws Exception {
		//BlackandRed = new BlackAndRed("Bet", 1);
		BlackandRed = new BlackAndRed("Black and Red", 1);

	}
	
	/**
	 * Test Getters for description and pay out.
	 *
	 */
	@Test
	public void testCreation() {
		assertEquals("Black and Red", BlackandRed.getDescription());
		assertEquals(1, BlackandRed.getPayout());
	}
	
	/**
	 * Test betIsMade for BlackAndRed 
	 *
	 */
	
	@Test
	void testBetIsMade() {
		String betChoice = "black";
		String betChoice2 = "red";
		Wheel myWheel = new Wheel(28, "black");
		Wheel myWheel2 = new Wheel(1, "red");
		Wheel myWheel3 = new Wheel(0, "green");
		assertEquals(false, BlackandRed.betIsMade(myWheel3, betChoice)); 
		assertEquals(true, BlackandRed.betIsMade(myWheel2, betChoice2)); 
		assertEquals(false, BlackandRed.betIsMade(myWheel, betChoice2)); 
		assertEquals(true, BlackandRed.betIsMade(myWheel, betChoice)); 



	}
}
