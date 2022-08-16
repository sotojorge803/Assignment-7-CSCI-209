/**
 * 
 */
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.HighLow;
import roulette.Wheel;
import roulette.Game;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class HighLowTest {
	
	private HighLow HighLow;
	
	@BeforeEach
	void setUp() throws Exception {
		//BlackandRed = new BlackAndRed("Bet", 1);
		HighLow = new HighLow("High or Low", 1);

	}
	
	/**
	 * Test Getters for description and pay out.
	 *
	 */
	@Test
	public void testCreation() {
		assertEquals("High or Low", HighLow.getDescription());
		assertEquals(1, HighLow.getPayout());
	}
	
	/**
	 * Test betisMade for HighLow
	 *
	 */
	
	@Test
	void testBetIsMade() {
		Wheel myWheel = new Wheel(28, "black");
		String betChoice = "high";
		String betChoice2 = "low";
		Wheel myWheel2 = new Wheel(1, "red");
		Wheel myWheel3 = new Wheel(0, "green");
		assertEquals(true, HighLow.betIsMade(myWheel, betChoice)); 
		assertEquals(true, HighLow.betIsMade(myWheel2, betChoice2)); 
		assertEquals(false, HighLow.betIsMade(myWheel3, betChoice)); 

	}
}