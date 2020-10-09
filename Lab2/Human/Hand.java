package Human;

public class Hand {
	private int fingers = 5;
	private String length = "medium";
	private String side;

	public Hand() {}

	public Hand(String side, int fingers) {
		this.side = side;
		this.fingers = fingers;
	}

	public Hand(String side, int fingers, String length) {
		this.side = side;
		this.fingers = fingers;
		this.length = length;
	}

	public String toString() {
		return "["+side+" leg], fingers: "+fingers+", length: "+length;
	}
}
