package Dish;

abstract public class Dish {
	protected String material = "porcelain";
	protected String color = "white";
	protected String type = "plates";
	protected int width = 10;
	protected int height = 10;
	protected float depth = 10;
	protected boolean isDecorative = false;

	Dish() { }

	Dish(String material, String color) {
		this.material = material;
		this.color = color;
	}

	Dish(String material, String color, boolean isDecorative) {
		this.material = material;
		this.color = color;
		this.isDecorative = isDecorative;
	}

	public abstract String getMaterial();

	public abstract void setMaterial(String material);

	public abstract String getColor();

	public abstract void setColor(String color);

	public abstract String getType();

	public abstract void setType(String type);

	public abstract int getWidth();

	public abstract void setWidth(int width);

	public abstract int getHeight();

	public abstract void setHeight(int height);

	public abstract float getDepth();

	public abstract void setDepth(float depth);

	public abstract boolean isDecorative();

	public abstract String toString();
}
