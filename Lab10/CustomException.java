import java.util.Scanner;

public class CustomException {
	public void demo() {
		try {
			System.out.println("Введите делитель числа 2: ");
			Scanner myScanner = new Scanner( System.in );
			String intString = myScanner.next();
			int i = Integer.parseInt(intString);
			System.out.println( 2 / i );
		} catch (NumberFormatException err) {
			System.err.println(err.getMessage());
		} finally {
			// Блок "finally" выполняется самым последним по счёту, следуя за "try" и/или "catch"
			System.out.println("Блок 'Finally'");
		}
	}
}
