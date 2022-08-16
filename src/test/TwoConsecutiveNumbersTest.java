/**
 * 
 */
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.TwoConsecutiveNumbers;
import roulette.Wheel;
import roulette.Game;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class TwoConsecutiveNumbersTest {
	
	private TwoConsecutiveNumbers Test;
	
	@BeforeEach
	void setUp() throws Exception {
		//BlackandRed = new BlackAndRed("Bet", 1);
		Test = new TwoConsecutiveNumbers("Two in a row", 17);

	}
	
	/**
	 * Test Getters for description and pay out.
	 *
	 */
	@Test
	public void testCreation() {
		assertEquals("Two in a row", Test.getDescription());
		assertEquals(17, Test.getPayout());
	}
	
	/**
	 * Test betisMade for TwoConsecutiveNumbers
	 *
	 */
	
	@Test
	void testBetIsMade() {
		Wheel myWheel = new Wheel(28, "black");
		String betChoice = "1";
		String betChoice2 = "28";
		Wheel myWheel2 = new Wheel(1, "red");
		Wheel myWheel3 = new Wheel(0, "green");
		assertEquals(true, Test.betIsMade(myWheel, betChoice2)); 
		assertEquals(true, Test.betIsMade(myWheel2, betChoice)); 
		assertEquals(false, Test.betIsMade(myWheel, betChoice)); 

	}
}