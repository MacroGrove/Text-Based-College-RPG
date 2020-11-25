import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Output extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 625;
	private final int HEIGHT = 525;
	private Border loweredetched;
	private TitledBorder border;
	private int index;
	private int i;

	public Output() {
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Output", TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.PLAIN, 16), Color.black);
		index = 0;
		i = 0;
	}

	/**
	 * 
	 */
	public void render() {
		super.setBorder(border);
		super.setMinimumSize(new Dimension(WIDTH - 300, HEIGHT - 200));
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));

//		Message m;
//		String s = "";
//		for (int i = 0; i < 10; i++) {
//			s = "  You've entered room ";
//			s += String.valueOf(i);
//			m = new Message(s, s);
//			m.render();
//			super.add(m);
//		}
	}

	/**
	 * 
	 * @param message
	 */
	public void addMessage(String message) {
		String s = String.valueOf(i);
		Message m = new Message("Response", message + " " + i);
		m.render();
		super.add(m);
		index++;
		i++;

		if (index > 10) {
			super.remove(0);
			index = 10;
		}
	}
}
