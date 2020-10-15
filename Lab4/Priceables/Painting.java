package Priceables;

public class Painting implements Priceable {
	public String author, name;
	public int price, year;

	public Painting(String author, String name, int year, int price) {
		this.author = author;
		this.name = name;
		this.year = year;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
