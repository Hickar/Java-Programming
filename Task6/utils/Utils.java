package utils;
import sort.Student;

import java.util.Random;

public class Utils {
	public static void printArray(Student[] studentsList) {
		for (Student student : studentsList) {
			System.out.println(student.getName() + ": " + student.getGrade());
		}
	}

	public static void swap(Student[] array, int a, int b) {
		Student temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static Student[] createArray(int length) {
		Random generator = new Random();
		Student[] array = new Student[length];
		for (int i = 0; i < length; i++) {
			array[i] = new Student("Student" + i, generator.nextInt(101));
		}
		return array;
	}
}
