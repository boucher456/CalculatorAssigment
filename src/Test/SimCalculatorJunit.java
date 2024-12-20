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

	@Test
	public void testAddSingleNumber() {
		SimCalculator calculator = new SimCalculator();
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testAddTwoNumbers() {
		SimCalculator calculator = new SimCalculator();
		assertEquals(6, calculator.add("1,5"));
	}

	@Test
	public void testAddWithNewLines() {
		SimCalculator calculator = new SimCalculator();
		assertEquals(6, calculator.add("1\n2,3"));
	}

	@Test
	public void testAddWithDifferentDelimiter() {
		SimCalculator calculator = new SimCalculator();
		assertEquals(3, calculator.add("//;\n1;2"));
	}

	@Test
	public void testAddWithNegativeNumbers() {
		SimCalculator calculator = new SimCalculator();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculator.add("1,-2,3");
		});
		assertTrue(exception.getMessage().contains("negative numbers not allowed"));
	}

}
