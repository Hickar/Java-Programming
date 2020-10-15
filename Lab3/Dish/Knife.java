package Dish;

public class Knife extends Dish {
	private String material = "silver";
	private String color = "silver";
	private boolean isDecorative = super.isDecorative;
	private int width = 2;
	private int height = 12;
	private float depth = 1;
	private String type = "Cutlery";

	public Knife() {
		super();
	}

	public Knife(String material, String color) {
		super(material, color);
	}

	public Knife(String material, String color, boolean isDecorative) {
		super(material, color, isDecorative);
	}

	public Knife(String material, String color, int width, int height, float depth, boolean isDecorative) {
		this.material = material;
		this.color = color;
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.isDecorative = isDecorative;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDecorative() {
		return isDecorative;
	}

	public String toString() {
		return "[" + type + "] " + "Material: " + material + ", Color: " + color + ", Dimensions: " +
				"(" + width + "x" + height + "x" + depth + ")," + " isDecorative: " + isDecorative;
	}
}
