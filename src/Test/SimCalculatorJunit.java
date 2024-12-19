package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.SimCalculator;

class SimCalculatorJunit {

	@Test
	public void testAddEmptyString() {
		SimCalculator calculator = new SimCalculator();
		assertEquals(0, calculator.add(""));
	}

}
