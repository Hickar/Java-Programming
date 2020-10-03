package sort;
import java.util.Comparator;
import utils.*;

public class SortingStudentsByGPA implements Comparator {
	private static int partition(Student[] array, int low, int high) {
		Comparable pivot = array[high].getGrade();
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (array[j].getGrade().compareTo(pivot) > 0) {
				i++;
				Utils.swap(array, i, j);
			}
		}
		Utils.swap(array, i + 1, high);
		return (i + 1);
	}

	public static void sort(Student[] array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			sort(array, low, pi - 1);
			sort(array, pi + 1, high);
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
}

