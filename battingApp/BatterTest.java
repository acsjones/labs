package battingApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatterTest {
	
	@Test
	public void whenBaseEarnedIs0_1ExpectedBattingAverageIs_333() {
	Batter b = new Batter(null);
	assertEquals("0.333",b.getFormattedBatAvg());
	}
}
