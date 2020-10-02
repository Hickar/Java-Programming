package task1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name) {
        this.name = name;
        this.age = 1;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Dog's name: " + this.name + ", age: " + this.age;
    }

    public String name() {
        return this.name;
    }

    public void name(String name) {
        this.name = name;
    }

    public int age() {
        return this.age;
    }

    public void age(int age) {
        this.age = age;
    }

    public int humanAge() {
        return this.age * 7;
    }

    public void bark() {
        System.out.println("Bark, bark!");
    }
}
