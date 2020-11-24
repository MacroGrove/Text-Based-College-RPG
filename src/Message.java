import java.awt.Dimension;

import javax.swing.JLabel;

public class Message extends JLabel {

	private final int WIDTH = 500;
	private final int HEIGHT = 25;

	public Message(String s) {
		super(s);
	}

	public void render() {
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

}
