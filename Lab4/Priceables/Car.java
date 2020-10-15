package Priceables;

public class Car implements Priceable {
	public String brand, model;
	public int price = 100000;

	public Car(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
