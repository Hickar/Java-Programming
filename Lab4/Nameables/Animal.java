package Nameables;

public class Animal implements Nameable {
	public String name;
	public int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
}
