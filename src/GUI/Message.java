package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Message extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 600;
	private final int HEIGHT = 50;
	private Border loweredetched;
	private TitledBorder border;

	public Message() {
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Message", TitledBorder.LEFT, TitledBorder.ABOVE_TOP,
				new Font(Font.SANS_SERIF, Font.ITALIC, 12), Color.black);
	}

	public Message(String message) {
		super(message);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Message", TitledBorder.LEFT, TitledBorder.ABOVE_TOP,
				new Font(Font.SANS_SERIF, Font.ITALIC, 12), Color.black);
	}

	public Message(String title, String message) {
		super(message);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, title, TitledBorder.LEFT, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.ITALIC, 12), Color.black);
	}

	/**
	 * 
	 */
	public void render() {
		super.setBorder(border);
		super.setMinimumSize(new Dimension(WIDTH - 400, HEIGHT));
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		super.setHorizontalAlignment(LEFT);
		super.setFont(new Font("Calibri", Font.PLAIN, 16));
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		super.setText(message);
	}

}
