package Human;

public class Head {
	private String size = "medium";
	private String hairColor = "brown";
	private String eyeColor = "blue";
	private int eyes = 2;

	public Head() {}

	public Head(String size) {
		this.size = size;
	}

	public Head(String size, String hairColor) {
		this.size = size;
		this.hairColor = hairColor;
	}

	public Head(String size, String hairColor, String eyeColor) {
		this.size = size;
		this.hairColor = hairColor;
		this.eyeColor = eyeColor;
	}

	public String toString() {
		return "[Head], size: "+size+", hair color: "+hairColor+", eye color: "+eyeColor+", eyes: "+eyes;
	}
}
