import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		String[] stringArray = {"One", "Two", "Three"};
		Integer[] intArray = {1, 2, 3};

		//Exercise 1
		System.out.println("Exercise 1");
		ArrayToListConverter converter = new ArrayToListConverter();
		LinkedList<String> stringList = converter.getList(stringArray);
		LinkedList<Integer> intList = converter.getList(intArray);

		System.out.println("String list: ");
		for (String element : stringList) {
			System.out.print(element + " ");
		}

		System.out.println("String list: ");
		for (Integer element : intList) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println();

		//Exercise 2-3
		System.out.println("Exercise 2-3");

		String[] stringArray2 = {"Four", "Five", "Six"};
		AnyTypeArray<String> anyTypeArray = new AnyTypeArray<>(stringArray);
		System.out.println("anyTypeArray[3]: " + anyTypeArray.getByIndex(2));

		Integer[] intArray2 = {4, 5, 6};
		AnyTypeArray<Integer> anyTypeArray2 = new AnyTypeArray<>(intArray);
		System.out.println("anyTypeArray[2]: " + anyTypeArray2.getByIndex(2));

		System.out.println();
	}
}
