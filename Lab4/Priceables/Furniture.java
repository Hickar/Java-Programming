package Priceables;

public class Furniture implements Priceable {
	public String type, brand;
	public int price;

	public Furniture(String type, String brand, int price) {
		this.type = type;
		this.brand = brand;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
