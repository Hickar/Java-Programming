import java.util.*;

public class ScoreManager {
	private ArrayList<Team> teamList = new ArrayList<>();
	private Team lastScorer;

	public ScoreManager(String teamOneID, String teamTwoID) {
		teamList.add(new Team(teamOneID));
		teamList.add(new Team(teamTwoID));
	}

	public void setScore(String teamID) {
		Team team = findTeam(teamID);
		team.addScore();
		this.lastScorer = team;
	}

	public String getScore() {
		return String.format("%s x %s", teamList.get(0).getScore(), teamList.get(1).getScore());
	}

	public String getLastScorer() {
		return lastScorer.getID();
	}

	public String getWinner() {
		Team teamOne = teamList.get(0);
		Team teamTwo = teamList.get(1);

		if (teamOne.getScore() > teamTwo.getScore()) return teamOne.getID();
		else if (teamOne.getScore() < teamTwo.getScore()) return teamTwo.getID();
		else return "DRAW";
	}

	private Team findTeam(String teamID) {
		for (Team team : teamList) {
			if (team.getID().equals(teamID)) return team;
		}
		return null;
	}
}
