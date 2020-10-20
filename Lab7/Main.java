import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer x, Integer y) {
				return x.compareTo(y);
			}
		};

		CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
		customArrayList.add(6);
		customArrayList.add(4);
		customArrayList.add(2);
		customArrayList.add(3);
		customArrayList.add(11);
		customArrayList.add(0, 12);
		customArrayList.remove(3);
		System.out.println("CustomList: " + customArrayList);

		customArrayList.sort(comparator);
		System.out.println("CustomList (sorted): " + customArrayList);
	}
}
