package Nameables;

public class NameablesTest {
	public static void init() {
		Planet planet1 = new Planet("Kepler b-68", 58600);
		System.out.println(planet1.getName());

		Planet planet2 = new Planet("Earth", 32600);
		System.out.println(planet2.getName());

		Animal animal1 = new Animal("Dog – Amy", 1);
		System.out.println(animal1.getName());

		Animal animal2 = new Animal("Cat – Archy", 4);
		System.out.println(animal2.getName());

		Car car1 = new Car("Toyota Land Cruiser");
		System.out.println(car1.getName());

		Car car2 = new Car("Audi R6");
		System.out.println(car2.getName());
	}
}
