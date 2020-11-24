import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Input extends JPanel implements KeyListener {

	private final int WIDTH = 1000;
	private final int HEIGHT = 35;
	private TitledBorder border;
	private JTextField text;

	public Input() {
		border = BorderFactory.createTitledBorder("Input");
		text = new JTextField();
	}

	/**
	 * 
	 */
	public void render() {
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.white);
		border.setTitleFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		super.setBorder(border);

		text.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		text.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		text.addKeyListener(this);
		super.add(text);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			text.setText("");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
