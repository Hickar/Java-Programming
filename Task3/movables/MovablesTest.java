package movables;

public class MovablesTest {
	public static void init() {
		MovablePoint mp1 = new MovablePoint(1, 1, 1, 1);
		mp1.moveDown();
		System.out.println(mp1);

		MovablePoint mp2 = new MovablePoint(4, 4, 3, 3);
		mp2.moveLeft();
		System.out.println(mp2);

		MovableCircle mc1 = new MovableCircle(1, 1, 1, 1, 2);
		mc1.moveUp();
		System.out.println(mc1);

		MovableCircle mc2 = new MovableCircle(2, 2, 5, 5, 1);
		mc2.moveRight();
		System.out.println(mc2);

		MovableRectangle mr1 = new MovableRectangle(0, 0, 2, 2, 1, 1);
		mr1.moveDown();
		System.out.println(mr1);

		MovableRectangle mr2 = new MovableRectangle(-10, 10, -5, -5, 3, 3);
		mr2.moveRight();
		System.out.println(mr2);
	}
}
