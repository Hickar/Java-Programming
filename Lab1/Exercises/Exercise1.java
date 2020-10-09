package Exercises;

import java.util.Random;

public class Exercise1 {
	public Exercise1(int size) {
		int[] array = generateRandomizedArray(size);

		int result = 0;
		for (int element : array) {
			result += element;
		}
		System.out.println("\"for\" loop sum output: " + result);


		int i = 0;
		result = 0;
		while (i < array.length) {
			result += array[i];
			i++;
		}
		System.out.println("\"while\" loop sum output: " + result);

		i = 0;
		result = 0;
		do {
			result += array[i];
			i++;
		} while (i < array.length);
		System.out.println("\"do-while\" loop sum output: " + result);
	}

	private int[] generateRandomizedArray(int size) {
		int[] array = new int[size];
		Random generator = new Random();

		for (int i = 0; i < size; i++) {
			array[i] = generator.nextInt(100);
		}

		return array;
	}
}
