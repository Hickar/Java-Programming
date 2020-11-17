package ex1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
	public Exercise1() {
		String regex = "(abcdefghijklmnopqrstuv18340)";
		Pattern pattern = Pattern.compile(regex);

		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();

		Matcher matcher = pattern.matcher(userInput);

		if (matcher.matches()) {
			System.out.println("'" + userInput + "' matches with string 'abcdefghijklmnopqrstuv18340'");
		} else {
			System.out.println("'" + userInput + "' DOES NOT match with string 'abcdefghijklmnopqrstuv18340'");
		}
	}
}
