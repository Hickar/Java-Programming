import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String[] mailAddresses = {
				"user@example.com",
				"root@localhost",
				"1219-2k@ya.ru",
				"egor.pershin243@edu.mirea.ru",
				"myhost@@@com.ru",
				"121s@mail.com",
				"@my.ru",
				"Julia String"
		};

		for (String address : mailAddresses) {
			if (isValidAddress(address)) {
				System.out.println("VALID: " + address);
			} else {
				System.out.println("INVALID: " + address);
			}
		}
	}

	public static boolean isValidAddress(String address) {
		String regex = "(^[a-zA-Z0-9_.+-]+)@([a-zA-Z0-9-]+\\.)?+[a-zA-Z0-9-.]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(address);
		return matcher.matches() ? true : false;
	}
}
