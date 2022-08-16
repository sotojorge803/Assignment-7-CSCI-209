/**
 * 
 */
package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.SingleNumber;
import roulette.Wheel;
import roulette.Game;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class SingleNumberTest {
	
	private SingleNumber SingleNumberTest;
	
	@BeforeEach
	void setUp() throws Exception {
		//BlackandRed = new BlackAndRed("Bet", 1);
		SingleNumberTest = new SingleNumber("Pick a Number", 35);

	}
	
	/**
	 * Test Getters for description and pay out.
	 *
	 */
	@Test
	public void testCreation() {
		assertEquals("Pick a Number", SingleNumberTest.getDescription());
		assertEquals(35, SingleNumberTest.getPayout());
	}
	
	/**
	 * Test betisMade for SingleNumber
	 *
	 */
	
	@Test
	void testBetIsMade() {
		Wheel myWheel = new Wheel(28, "black");
		String betChoice = "1";
		String betChoice2 = "28";
		Wheel myWheel2 = new Wheel(1, "red");
		Wheel myWheel3 = new Wheel(0, "green");
		assertEquals(true, SingleNumberTest.betIsMade(myWheel, betChoice2)); 
		assertEquals(true, SingleNumberTest.betIsMade(myWheel2, betChoice)); 
		assertEquals(false, SingleNumberTest.betIsMade(myWheel, betChoice)); 

	}
}