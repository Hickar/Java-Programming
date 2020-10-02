package task1;

public class Ball {
	private double radius = 1;
	private double weight = 1;
	private String color = "orange";

	public Ball(double radius) {
		this.radius = radius;
	}

	public Ball(double radius, double weight) {
		this.radius = radius;
		this.weight = weight;
	}

	public Ball(double radius, double weight, String color) {
		this.radius = radius;
		this.weight = weight;
		this.color = color;
	}

	public double volume() {
		return (4f / 3f) * Math.PI * Math.pow(radius, 3);
	}

	public String toString() {
		return "Ball's color: " + this.color + ", radius: " + this.radius + ", weight: " + this.weight;
	}

	public double radius() {
		return this.radius;
	}

	public void radius(double radius) {
		this.radius = radius;
	}

	public double weight() {
		return this.weight;
	}

	public void weight(double weight) {
		this.weight = weight;
	}

	public String color() {
		return this.color;
	}

	public void color(String color) {
		this.color = color;
	}

}
