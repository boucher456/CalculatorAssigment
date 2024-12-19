package calculator;

import java.util.Arrays;

public class SimCalculator {
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		String[] nums = numbers.split(",");
		return Arrays.stream(nums).mapToInt(Integer::parseInt).sum();// Placeholder for other logic
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}
}
