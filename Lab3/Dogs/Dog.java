package Dogs;

abstract public class Dog {
	protected String name = "Doggy";
	protected int age = 1;
	protected String color = "brown";
	protected String size = "medium";

	public Dog() {};

	public Dog(String name, int age) {};

	public Dog(String name, int age, String color, String size) {};

	abstract public void bark();

	abstract public String getName();

	abstract public void setName(String name);

	abstract public int getAge();

	abstract public void setAge(int age);

	abstract public String getColor();

	abstract public void setColor(String color);

	abstract public String getSize();

	abstract public void setSize(String size);
}
