package sort;

public class Student {
	private String name;
	private Comparable grade;

	public Student(String name, Comparable grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Comparable getGrade() {
		return this.grade;
	}

	public void setGrade(Comparable grade) {
		this.grade = grade;
	}
}
