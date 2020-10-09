package WaitLists;

public class BoundedWaitList<T> extends WaitList<T> {
	private int capacity;

	public BoundedWaitList(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void add(T element) {
		if (content.size() == capacity) {
			System.err.println("Maximum capacity was reached");
//			throw new Error("Maximum capacity was reached");
		} else {
			super.add(element);
		}
	}

	public String toString() {
		return super.toString() + String.format(", capacity: %d", capacity);
	}
}
