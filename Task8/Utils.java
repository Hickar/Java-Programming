import WaitLists.BoundedWaitList;
import WaitLists.UnfairWaitList;
import WaitLists.WaitList;

import java.util.ArrayList;
import java.util.Collection;

public class Utils {
	public static <T> void testList(WaitList<T> list, String listName) {
		try {
			ArrayList<T> testArray = new ArrayList<>();
			if (Math.random() > 0.5) fillList(testArray, list.size() + 2);
			else fillList(testArray, list.size() - 2);

			String emptyState = list.isEmpty() ? "empty" : "not empty";
			String numberContainmentState = list.contains((T) (Integer) 7) ? "true" : "false";
			String subCollectionContainment = list.containsAll(testArray) ? "true" : "false";

			System.out.println(listName + ": " + list);
			System.out.println(listName + " is " + emptyState);
			System.out.println(listName + " contains element \"7\": " + numberContainmentState);
			System.out.println(listName + " contains all elements of \"someNumbers\": " + subCollectionContainment);
			System.out.println("\"testArray\": " + testArray);

			if (list instanceof BoundedWaitList) {
				list.add((T) (Integer) 4);
			}

			if (list instanceof UnfairWaitList) {
				((UnfairWaitList<T>) list).moveToBack();
				System.out.println(listName + " after taking first element to the tail: " + list);
			}

			System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
		} catch (Exception err) {
			System.err.println(err.getMessage());
		}
	}

	public static <T> void fillList(Collection<T> collection, int size) {
		for (Integer i = 0; i < size; i++) {
			collection.add(((T) i));
		}
	}

	public static <T> void fillList(WaitList<T> waitList, int size) {
		for (Integer i = 0; i < size; i++) {
			waitList.add(((T) i));
		}
	}
}
