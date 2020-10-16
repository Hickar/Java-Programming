import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
	private final JFrame frame = new JFrame("Task 5");
	private final JLabel label = new JLabel();
	private final ArrayList<BufferedImage> frames = new ArrayList<>();

	public App() {
		frame.add(label);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	public void start(String imageDirPath) {
		try {
			File dir = new File(imageDirPath);
			File[] files = dir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().contains("frame");
				}
			});

			if (files == null) throw new Error("Folder with such path doesn't exist");
			Arrays.sort(files);

			for (File image : files) {
				this.frames.add(bufferImage(image));
			}

			setWindowSize();
			setImageChangeOnTimer(100);
		} catch (Error err) {
			System.err.println(err.getMessage());
		}
	}

	private void setWindowSize() {
		int width = 0, height = 0;

		for (BufferedImage frame : frames) {
			if (frame.getWidth() > width && frame.getHeight() > height) {
				width = frame.getWidth();
				height = frame.getHeight();
			}
		}

		frame.setMinimumSize(new Dimension(width, height));
		frame.setSize(width, height);
	}

	private void setImageChangeOnTimer(int delay) {
		if (label == null) {
			JPanel panel = new JPanel();
			frame.add(panel);
		}

		while (true) {
			for (BufferedImage frame : frames) {
				label.getGraphics().drawImage(frame, 0, 0, null);
				try {
					Thread.sleep(delay);
				} catch (Exception err) {
					System.err.println(err.getMessage());
				}
			}
		}
	}

	public BufferedImage bufferImage(File file) {
		try {
			return ImageIO.read(file);
		} catch (IOException err) {
			System.err.println(err.getMessage());
		}
		return null;
	}
}
