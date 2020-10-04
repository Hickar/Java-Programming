public class Main {
	public static void main(String[] args) {
		recursionEx1(1, 5);
		recursionEx2(1, 10);
		recursionEx3(1, 10);
	}

//	Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз:
//	1, 2, 2, 3, 3, 3, 4, 4, 4, 4,...
//	По данному натуральному n выведите первые n членов этой последовательности.
//	Попробуйте обойтись только одним циклом for.
	public static void recursionEx1(int current, int end) {
		for (int i = 0; i < current; ++i) {
			if (current == end && i == current - 1) {
				System.out.print(current + " ");
			} else {
				System.out.print(current + ", ");
			}
		}
		if (current < end) recursionEx1(++current, end);
	}

//	Дано натуральное число n. Выведите все числа от 1 до n.
	public static void recursionEx2(int current, int end) {
		if (current == end) System.out.print(end);
		else {
			System.out.print(current + " ");
			recursionEx2(++current, end);
		};
	}

//	Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
//	в порядке возрастания, если A < B, или в порядке убывания в противном случае.
	public static void recursionEx3(int start, int end) {
		if (start < end) {
			System.out.print(start + " ");
			recursionEx3(++start, end);
		} else if (start > end) {
			System.out.print(start + " ");
			recursionEx3(--start, end);
		} else {
			System.out.print(start);
		}
	}
}
