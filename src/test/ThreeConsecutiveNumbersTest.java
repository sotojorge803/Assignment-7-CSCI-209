/**
 * 
 */
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.ThreeConsecutiveNumbers;
import roulette.Wheel;
import roulette.Game;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class ThreeConsecutiveNumbersTest {
	
	private ThreeConsecutiveNumbers Test;
	
	@BeforeEach
	void setUp() throws Exception {
		//Test = new ThreeConsecutiveNumbers("Bet", 1);
		Test = new ThreeConsecutiveNumbers("Three in a row", 11);

	}
	
	/**
	 * Test Getters for description and pay out.
	 *
	 */
	@Test
	public void testCreation() {
		assertEquals("Three in a row", Test.getDescription());
		assertEquals(17, Test.getPayout());
	}
	
	/**
	 * Test betisMade for ThreeConsecutiveNumbers
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