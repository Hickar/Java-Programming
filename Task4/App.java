import java.awt.*;
import javax.swing.*;

public class App {
	JFrame frame;
	JPanel buttonsPanel = new JPanel(new FlowLayout());
	JPanel infoPanel = new JPanel(new GridLayout(0, 1));

	JButton buttonMilan = new JButton("AC Milan");
	JButton buttonMadrid = new JButton("Real Madrid");
	JLabel scoreText = new JLabel("Result: 0 x 0");
	JLabel lastScorerText = new JLabel("Last scorer: N/A");
	Label winnerText = new Label("Winner: DRAW");
	ScoreManager scoreManager = new ScoreManager("AC Milan", "Real Madrid");

	public App() {
		frame = new JFrame("Button Soccer 2020");
		frame.setLayout(new FlowLayout());
		frame.setMinimumSize(new Dimension(250, 170));
		frame.setSize(250,170);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		buttonsPanel.add(buttonMilan);
		buttonMilan.addActionListener(new ButtonListener(this));
		buttonsPanel.add(buttonMadrid);
		buttonMadrid.addActionListener(new ButtonListener(this));
		frame.add(buttonsPanel);

		infoPanel.add(scoreText);
		infoPanel.add(lastScorerText);
		infoPanel.add(winnerText);
		frame.add(infoPanel);

		frame.setVisible(true);
	}

	public static void main(String[]args) {
		new App();
	}
}