public class AnyTypeArray<E> {
	Object[] elements;

	public AnyTypeArray(E[] elements) {
		this.elements = elements;
	}

	public E getByIndex(int i) {
		return (E)elements[i];
	}
}
