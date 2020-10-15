import Dish.*;

public class DishTest {
	public DishTest() {
		Plate plate1 = new Plate();
		System.out.println(plate1);

		Plate plate2 = new Plate("Ceramic", "Pink", 20, 30, 5f, true);
		System.out.println(plate2);
		plate2.uniquePlateMethod();

		Spoon spoon1 = new Spoon("Aluminum", "Dark gray");
		spoon1.uniqueSpoonMethod();

		Spoon spoon2 = new Spoon("Bronze", "Blue");
		System.out.println(spoon2.getType());
		System.out.println(spoon2);

		Glass glass1 = new Glass("Glass", "transparent");
		System.out.println(glass1.isDecorative());
	}
}
