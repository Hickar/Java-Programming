import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class MenuItemAction implements ActionListener {
	private App ctx;
	private String action;

	public MenuItemAction(App ctx, String action) {
		this.ctx = ctx;
		this.action = action;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			JMenuItem itemClicked = (JMenuItem) e.getSource();
			String command = itemClicked.getText().toLowerCase();

			switch (action) {
				case "setColor":
					Field field = Class.forName("java.awt.Color").getField(command);
					ctx.textArea.setForeground((Color)field.get(null));
					break;
				case "setFont":
					ctx.textArea.setFont(new Font(command, Font.PLAIN, 12));
					break;
				default:
					throw new Error("There's no such action: " + command);
			}
		} catch (Exception err) {
			System.err.println(err.getMessage());
		}
	}
}
