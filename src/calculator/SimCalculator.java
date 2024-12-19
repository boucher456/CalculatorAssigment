package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SimCalculator {
	public static int add(String numbers) {
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
		List<Integer> negatives = Arrays.stream(nums).map(Integer::parseInt).filter(n -> n < 0)
				.collect(Collectors.toList());
		if (!negatives.isEmpty()) {
			throw new IllegalArgumentException("negative numbers not allowed " + negatives);
		}
		return Arrays.stream(nums).mapToInt(Integer::parseInt).sum();
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	try {
		System.out.println(add("-1,2"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
