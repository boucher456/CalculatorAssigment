package calculator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SimCalculator {
	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		String delimiter = ",|\n";
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			delimiter = Pattern.quote(numbers.substring(2, delimiterIndex));
			numbers = numbers.substring(delimiterIndex + 1);
		}
		String[] nums = numbers.split(delimiter);
		return Arrays.stream(nums).mapToInt(Integer::parseInt).sum();
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}
}
