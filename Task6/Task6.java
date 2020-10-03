import java.util.Arrays;
import java.util.stream.Stream;
import sort.*;
import utils.*;

public class Task6 {
	public static void main(String[] argv) {
		Student[] studentsList1 = Utils.createArray(100);
		Student[] studentsList2 = Utils.createArray(100);

		InsertionSort.sort(studentsList1);
		SortingStudentsByGPA.sort(studentsList2, 0, studentsList2.length - 1);

		Student[] studentsList3 = Stream.concat(Arrays.stream(studentsList1), Arrays.stream(studentsList2))
				.toArray(Student[]::new);
		MergeSort.sort(studentsList3, 0, studentsList3.length - 1);
		Utils.printArray(studentsList3);
	}
}