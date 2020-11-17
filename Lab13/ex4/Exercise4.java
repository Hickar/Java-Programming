package ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
	public Exercise4() {
		String[] dateArray = {
				"29/02/2000",
				"30/04/2003",
				"25/02/1914",
				"29/02/2001",
				"04/07/3015",
				"30-04-2003",
				"1/1/1899",
				"10/10/987",
				"21/12/10012"
		};

		for (String element : dateArray) {
			if (isValidDate(element)) System.out.println("VALID: " + element);
			else System.out.println("INVALID: " + element);
		}
	}

	Boolean isValidDate(String unformattedString) {
		String regex = "(\\d{2})\\/(\\d{2})\\/(([1][9]\\d{2})|(\\d{4}))";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(unformattedString);
		return matcher.matches() ? true : false;
	}
}