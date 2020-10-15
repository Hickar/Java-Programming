package Priceables;

public class PriceablesTest {
	public static void init() {
		Car car1 = new Car("Toyota", "Land Cruiser", 1500000);
		System.out.println(car1.getPrice());

		Car car2 = new Car("Ford", "Siesta", 450000);
		System.out.println(car2.getPrice());

		Painting painting1 = new Painting("Vincent Van Gogh", "The starry night", 1889, 50000000);
		System.out.println(painting1.getPrice());

		Painting painting2 = new Painting("Ilya Repin", "Portrait of Lev Tolstoy", 1887, 1000000);
		System.out.println(painting2.getPrice());

		Furniture furnitureItem1 = new Furniture("Chair", "Ikea", 2999);
		System.out.println(furnitureItem1.getPrice());

		Furniture furnitureItem2 = new Furniture("Closet", "Garant", 10500);
		System.out.println(furnitureItem2.getPrice());
	}
}
