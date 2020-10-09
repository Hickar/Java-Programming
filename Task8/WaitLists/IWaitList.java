package WaitLists;

import java.util.Collection;

public interface IWaitList<T> {
	public void add(T element);

	public void remove(T element);

	public boolean contains(T element);

	public boolean containsAll(Collection<T> elements);

	public boolean isEmpty();
}
