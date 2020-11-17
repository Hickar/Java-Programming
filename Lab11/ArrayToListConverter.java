import java.util.LinkedList;

public class ArrayToListConverter <E> {
	public ArrayToListConverter() {};

	public LinkedList <E> getList(E[] array) {
		LinkedList<E> list = new LinkedList<E>();
		for (E element : array) {
			list.add(element);
		}
		return list;
	}
}
