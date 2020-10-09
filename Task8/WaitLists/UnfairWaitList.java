package WaitLists;

public class UnfairWaitList<T> extends WaitList<T> {
	public UnfairWaitList() {
		super();
	}

	@Override
	public void remove(T element) {
		super.remove(element);
	}

	public void moveToBack() {
		T temp = content.poll();
		super.add(temp);
	}
}
