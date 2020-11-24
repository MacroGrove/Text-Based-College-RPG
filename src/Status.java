import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Status extends JPanel {

	private final int WIDTH = 625;
	private final int HEIGHT = 0;
	private TitledBorder border;

	public Status() {
		border = BorderFactory.createTitledBorder("Status");
	}

	/**
	 * 
	 */
	public void render() {
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.white);
		border.setTitleFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		super.setBorder(border);
	}

}
