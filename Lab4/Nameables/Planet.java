package Nameables;

public class Planet implements Nameable {
	public String name;
	public int radius = 40000;

	public Planet(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}

	public String getName() {
		return name;
	}
}
