package Human;

public class Human {
	private String gender;
	private String skinColor;
	private int age;
	private Leg leftLeg, rightLeg;
	private Hand leftHand, rightHand;
	private Head head;

	public Human(String gender, String skinColor, int age) {
		this.gender = gender;
		this.skinColor = skinColor;
		this.age = age;
		attachLimbs();
	}

	private void attachLimbs() {
		this.leftLeg = new Leg("left", 5, "medium");
		this.rightLeg = new Leg("right", 5, "medium");
		this.leftHand = new Hand("left", 5, "medium");
		this.rightHand = new Hand("right", 5, "medium");
		this.head = new Head("medium", "blonde", "green");
	}

	public String toString() {
		return "Gender: "+gender+", skin color: "+skinColor+", age: "+age;
	}

	public void info() {
		System.out.println(leftLeg);
		System.out.println(rightLeg);
		System.out.println(leftHand);
		System.out.println(rightHand);
		System.out.println(head);
	}
}
