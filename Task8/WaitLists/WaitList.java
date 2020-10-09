package WaitLists;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T> {
	protected ConcurrentLinkedQueue<T> content;

	public WaitList() {
		content = new ConcurrentLinkedQueue<T>();
	}

	public WaitList(Collection<T> elements) {
		content = new ConcurrentLinkedQueue<T>(elements);
	}

	public void add(T element) {
		content.add(element);
	}

	public void remove(T element) {
		content.remove(element);
	}

	public boolean contains(T element) {
		return content.contains(element);
	}

	public boolean containsAll(Collection<T> elements) {
		return content.containsAll(elements);
	}

	public boolean isEmpty() {
		return content.isEmpty();
	}

	public int size() {
		return content.size();
	}

	public String toString() {
		String result = "[";
		Iterator<T> contentIterator = content.iterator();
		for (T element : content) {
			result += contentIterator.next();
			if (contentIterator.hasNext()) result += ", ";
		}
		return result + "]";
	}
}
