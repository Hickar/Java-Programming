import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class App {
	JFrame frame = new JFrame("Lab 6");
	JTextArea textArea = new JTextArea(10, 10);
	JScrollPane scrollPane = new JScrollPane(textArea);
	Font defaultFont = new Font("Times New Roman", Font.PLAIN, 12);
	JMenuBar menuBar;
	int windowWidth = 300, windowHeight = 300;

	public App() {
		frame.setLayout(new BorderLayout());
		setSizes();
		createMenuBar();
		createTextArea();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void setSizes() {
		textArea.setMaximumSize(new Dimension(windowWidth, windowHeight));
		frame.setMinimumSize(new Dimension(windowWidth, windowHeight));
		frame.setSize(new Dimension(windowWidth, windowHeight));

		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				textArea.setRows((int) ((frame.getHeight() - menuBar.getHeight()) / 17.6));
				textArea.setColumns((int) (frame.getWidth() / 10.8));
				frame.revalidate();
			}
		});
	}

	private void createTextArea() {
		textArea.setLineWrap(true);
		textArea.setFont(defaultFont);
		frame.add(scrollPane);
		System.out.println("Rows: "+textArea.getRows());
	}

	private void createMenuBar() {
		menuBar = new JMenuBar();
		JMenu menuColor = new JMenu("Color");
		JMenu menuFont = new JMenu("Font");

		JMenuItem[] colorOptions = {
				new JMenuItem("Blue"),
				new JMenuItem("Red"),
				new JMenuItem("Black") };
		JMenuItem[] fontOptions = {
				new JMenuItem("Times New Roman"),
				new JMenuItem("MS Sans Serif"),
				new JMenuItem("Courier New") };

		for (JMenuItem menuItem : colorOptions) {
			menuItem.addActionListener(new MenuItemAction(this, "setColor"));
			menuColor.add(menuItem);
		}

		for (JMenuItem menuItem : fontOptions) {
			menuItem.addActionListener(new MenuItemAction(this, "setFont"));
			menuFont.add(menuItem);
		}

		menuBar.add(menuColor);
		menuBar.add(menuFont);
		frame.setJMenuBar(menuBar);
	}
}
