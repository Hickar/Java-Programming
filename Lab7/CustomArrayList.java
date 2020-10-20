import java.util.*;

public class CustomArrayList<T> extends AbstractList {
	Object[] data;
	private int capacity = 0;
	private int defaultCapacity = 10;
	private int size = 0;

	public CustomArrayList() {
		data = new Object[defaultCapacity];
	}

	public CustomArrayList(int capacity) {
		data = new Object[capacity];
	}

	public CustomArrayList(Collection<T> collection) {
		data = collection.toArray();
	}

	public boolean add(Object element) {
		if (size + 1 == capacity) enlarge();
		data[size] = element;
		size++;
		return true;
	}

	public void add(int index, Object element) {
		data[index] = element;
	}

	public boolean addAll(int index, Collection collection) {
		Iterator iterator = collection.iterator();
		for (int i = 0; i < collection.size(); i++) {
			add(index, iterator.next());
			index++;
		}
		return true;
	}

	public void clear() {
		for (Object element : data) {
			element = null;
		}
	}

	public Object remove(int index) {
		Object element = data[index];
		System.arraycopy(data, index+1, data, index, data.length - index - 1);
		return element;
	}

	public Object get(int index) {
		return data[index];
	}

	public int indexOf(Object object) {
		int index = -1;
		for (int i = 0; i < capacity; i++) {
			if (object == data[i]) {
				index = i;
				break;
			}
		}

		return index;
	}

	public int lastIndexOf(Object object) {
		int index = -1;
		for (int i = 0; i < capacity; i++) {
			if (object == data[i]) index = i;
		}

		return index;
	}

	public int size() {
		return size;
	}

	public void sort(Comparator comparator) {
		Object key;
		int i, j;
		for (i = 0; i < data.length; i++) {
			if (data[i] != null) {
				key = data[i];
				j = i - 1;
				if (j > -1 && data[j] == null) return;

				while (j >= 0 && comparator.compare(key, data[j]) < 0) {
					swap(data, j + 1, j);
					j = j - 1;
				}
				data[j + 1] = key;
			}
		}
	}

	private void enlarge() {
		capacity += capacity >> 1;
		data = Arrays.copyOf(data, capacity);
	}

	private void swap(Object[] array, int a, int b) {
		Object temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
