package battingApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatterTest {
	
	@Test
	public void whenBaseEarnedIs0_1ExpectedSlugPerIs_500() {
	Batter b = new Batter(null);
	assertEquals("0.500",b.getFormattedSlugPer());
	}
	@Test
	public void whenBaseEarnedIs0_1_2ExpectedSlugPerIs_1() {
		Batter b = new Batter(null);
		assertEquals("1.000",b.getFormattedSlugPer());
		}
	
	
	
	
}
