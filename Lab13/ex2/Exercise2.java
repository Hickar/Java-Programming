package ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
	public Exercise2() {
		String[] financeValuesArray = {
				"25.48 RUB",
				"10.11 EU",
				"34.23 USD",
				"156.1 RUB",
				"1000 USD",
				"45.005 USD",
				"23.42 EUR"
		};

		for (String element : financeValuesArray) {
			if (isValidFinanceValue(element)) System.out.println("VALID: " + element);
			else System.out.println("INVALID: " + element);
		}
	}

	Boolean isValidFinanceValue(String unformattedString) {
		String regex = "(\\d+|(\\d+)(\\.)(\\d{1}|\\d{2}))\\s(RUB|USD|EU)";
//		String regex = "(\\d+)\\.(\\d{1}|\\d{2})\\s(RUB|USD|EU)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(unformattedString);
		return matcher.matches() ? true : false;
	}
}
