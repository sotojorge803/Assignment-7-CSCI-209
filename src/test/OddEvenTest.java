/**
 * 
 */
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.OddEven;
import roulette.Wheel;
import roulette.Game;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class OddEvenTest {
	
	private OddEven OddEvenTest;
	
	@BeforeEach
	void setUp() throws Exception {
		//BlackandRed = new BlackAndRed("Bet", 1);
		OddEvenTest = new OddEven("Odd or Even", 1);

	}
	
	/**
	 * Test Getters for description and pay out.
	 *
	 */
	@Test
	public void testCreation() {
		assertEquals("Odd or Even", OddEvenTest.getDescription());
		assertEquals(1, OddEvenTest.getPayout());
	}
	
	/**
	 * Test betIsMade for OddEven 
	 *
	 */
	
	@Test
	void testBetIsMade() {
		String betChoice = "odd";
		String betChoice2 = "even";
		Wheel myWheel = new Wheel(28, "black");
		Wheel myWheel2 = new Wheel(1, "red");
		Wheel myWheel3 = new Wheel(0, "green");
		assertEquals(true, OddEvenTest.betIsMade(myWheel, betChoice2)); 
		assertEquals(true, OddEvenTest.betIsMade(myWheel2, betChoice));
	}
}
