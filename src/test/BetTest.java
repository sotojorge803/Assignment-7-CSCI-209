package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import roulette.Bet;
import roulette.Wheel;
import roulette.BlackAndRed;
import roulette.HighLow;
import roulette.OddEven;
import roulette.HighLow;
import roulette.SingleNumber;
import roulette.TwoConsecutiveNumbers;
import roulette.ThreeConsecutiveNumbers;
/**
 * Minimally tests the Bet class.
 * 
 * @author Robert C. Duvall
 */
public class BetTest {

	private Bet b;

	@BeforeEach
	void setUp() throws Exception {
		//b = new Bet("Bet", 13);
	}

	@Test
	public void testCreation() {
		assertEquals("Bet", b.getDescription());
		assertEquals(13, b.getPayout());
		
	}
}
