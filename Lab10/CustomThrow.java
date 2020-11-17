import java.util.Scanner;

public class CustomThrow {
	public void getKey() {
		System.out.print("Укажите значение ключа: ");
		while (true) {
			try {
				Scanner myScanner = new Scanner(System.in);
				String key = myScanner.nextLine();
				printDetails(key);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Строка не должна быть пустой. Повторите ввод: ");
			}
		}
	}

	public void printDetails(String key) throws Exception {
		String message = getDetails(key);
		System.out.println(message);
	}

	private String getDetails(String key) throws Exception {
		if (key.isEmpty()) throw new Exception("Key set to empty string");
		return "Data for '" + key + "'";
	}
}
