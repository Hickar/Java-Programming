package ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
	public Exercise3() {
		String[] dateArray = {
				"(4 + 13) - 18 * 3",
				"(20 - 10) + 4 * 8",
				"(4 - 2) - 35",
				"3+7-10",
				"14+3 + 15"
		};

		for (String element : dateArray) {
			if (hasPlusSymbol(element)) {
				checkOperandsBeforeOperationChar(element);
			} else {
				System.out.println("There's no '+' symbol in string '"+element+"'");
			}
		}
	}

	void checkOperandsBeforeOperationChar(String unformattedString) {
		String regex = "(\\d+|\\(.*\\))\\s?(\\+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(unformattedString);

		while (matcher.find()) {
			System.out.println("Operand before '+' in string '" + unformattedString + "': " + matcher.group(1));
		}
	}

	boolean hasPlusSymbol(String unformattedString) {
		String regex = "(\\d+|\\(.*\\))\\s?(\\+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(unformattedString);

		return matcher.find() ? true : false;
	}
}
