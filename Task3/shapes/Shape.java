package shapes;

abstract public class Shape {
	protected String color = "none";
	protected boolean filled = false;

	Shape() {}

	Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return this.filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	@Override
	public abstract String toString();
}
