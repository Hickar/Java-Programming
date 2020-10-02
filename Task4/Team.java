public class Team {
	private String ID;
	private int score = 0;

	public Team(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return this.ID;
	}

	public int getScore() {
		return this.score;
	}

	public void addScore() {
		this.score += 1;
	}
}
