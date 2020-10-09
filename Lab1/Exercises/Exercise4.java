package Exercises;

import java.util.Random;

public class Exercise4 {
	public Exercise4(int size) {
		int[] array = generateRandomizedArray(size);
		printArray(array);
		sort(array);
		printArray(array);
	}

	private int[] generateRandomizedArray(int size) {
		int[] array = new int[size];
		Random generator = new Random();

		for (int i = 0; i < size; i++) {
			array[i] = generator.nextInt(100);
		}

		return array;
	}

	private void printArray(int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) result += array[i] + " ";
			else result += array[i] + "]";
		}
		System.out.println(result);
	}

	private void sort(int[] array) {
		int key;
		int i, j;
		for (i = 0; i < array.length; i++) {
			key = array[i];
			j = i - 1;

			while (j >= 0 && key < array[j]) {
				swap(array, j + 1, j);
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
