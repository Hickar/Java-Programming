package sort;
import utils.*;

public class InsertionSort {
	public static void sort(Student[] array) {
		Comparable key;
		int i, j;
		for (i = 0; i < array.length; i++) {
			key = array[i].getGrade();
			j = i - 1;

			while (j >= 0 && key.compareTo(array[j].getGrade()) < 0) {
				Utils.swap(array, j + 1, j);
				j = j - 1;
			}
			array[j + 1].setGrade(key);
		}
	}
}
