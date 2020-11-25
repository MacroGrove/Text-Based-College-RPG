import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Status extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 625;
	private final int HEIGHT = 525;
	private Border loweredetched;
	private TitledBorder border;

	public Status() {
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Status", TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.PLAIN, 16), Color.black);
	}

	/**
	 * 
	 */
	public void render() {
		super.setBorder(border);
		super.setMinimumSize(new Dimension(WIDTH - 300, HEIGHT - 200));
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));

	}

}
