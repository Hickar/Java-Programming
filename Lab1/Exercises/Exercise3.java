package Exercises;

public class Exercise3 {
	public Exercise3(int count) {
		for (int i = 1; i <= count; i++) {
			if (i != count) System.out.print((double) 1 / i + " ");
			else System.out.print((double) 1 / i);
		}
		System.out.println();
	}
}
