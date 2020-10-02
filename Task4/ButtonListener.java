import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonListener implements ActionListener {
	private App ctx;

	public ButtonListener(App ctx) {
		this.ctx = ctx;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String teamName = button.getText();

		ctx.scoreManager.setScore(teamName);
		ctx.scoreText.setText("Result: " + ctx.scoreManager.getScore());
		ctx.lastScorerText.setText("Last scorer: " + ctx.scoreManager.getLastScorer());
		ctx.winnerText.setText("Winner: " + ctx.scoreManager.getWinner());
	}
}
