import WaitLists.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		WaitList<Integer> waitList1 = new WaitList<>();
		Utils.fillList(waitList1, 10);
		Utils.testList(waitList1, "waitList1");

		ArrayList<Integer> testArray = new ArrayList<>();
		Utils.fillList(testArray, 5);
		WaitList<Integer> waitList2 = new WaitList<>(testArray);
		Utils.testList(waitList2, "waitList2");

		BoundedWaitList<Integer> boundedList1 = new BoundedWaitList<>(7);
		Utils.fillList(boundedList1, 7);
		Utils.testList(boundedList1, "boundedList1");

		UnfairWaitList<Integer> unfairList1 = new UnfairWaitList<>();
		Utils.fillList(unfairList1, 4);
		Utils.testList(unfairList1, "unfairList1");
	}
}