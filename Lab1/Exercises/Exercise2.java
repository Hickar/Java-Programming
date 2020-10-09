package Exercises;

public class Exercise2 {
	public Exercise2(String[] args) {
		if (args.length == 0) {
			System.out.println("Program was launched without any command line arguments!");
		} else {
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "]: " + args[i]);
			}
		}
	}
}
