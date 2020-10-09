import Circle.*;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("CircleTest");

		Circle circle1 = new Circle(2.5, "emerald", true);
		System.out.println("circle1 " + circle1);
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());
		System.out.println();

		Circle circle2 = new Circle(4);
		System.out.println("circle2 " + circle2);
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
		System.out.println();
	}
}
