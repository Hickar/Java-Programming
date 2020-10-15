package Dogs;

public class Beagle extends Dog {
	protected String name = super.name;
	protected int age = super.age;
	protected String color = super.color;
	protected String size = super.size;
	private String uniqueBark = "Ooooof-Oooooof-Uf!!!";

	public Beagle() {};

	public Beagle(String name, int age) {};

	public Beagle(String name, int age, String color, String size) {};

	public void bark() {
		System.out.println(name+" says: "+uniqueBark);
	};

	public String getName() {
		return name;
	};

	public void setName(String name) {
		this.name = name;
	};

	public int getAge() {
		return age;
	};

	public void setAge(int age) {
		this.age = age;
	};

	public String getColor() {
		return color;
	};

	public void setColor(String color) {
		this.color = color;
	};

	public String getSize() {
		return size;
	};

	public void setSize(String size) {
		this.size = size;
	};

	public String toString() {
		return "["+name+"]: Beagle, "+age+", "+color+", "+size;
	}
}
