import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Output extends JPanel {

	private final int WIDTH = 625;
	private final int HEIGHT = 0;
	private TitledBorder border;
	private JTextArea text;

	public Output() {
		border = BorderFactory.createTitledBorder("Output");
	}

	public void render() {
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.white);
		border.setTitleFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		super.setBorder(border);

//		Message m;
//		String s = "";
//		for (int i = 0; i < 600; i++) {
//			s = String.valueOf(i);
//			m = new Message("\n Hello!");
//			m.render();
//			super.add(m);
//		}
	}

}
