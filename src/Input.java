import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Input extends JPanel implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 500;
	private final int HEIGHT = 35;
	private Parser parser;
	private Border loweredetched;
	private TitledBorder border;
	private JTextField text;
	private String action;

	public Input(Parser parser) {
		this.parser = parser;
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Input", TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
				new Font(Font.SANS_SERIF, Font.PLAIN, 16), Color.black);
		text = new JTextField();
		action = null;
	}

	/**
	 * 
	 */
	public void render() {
		super.setBorder(border);

		text.setMinimumSize(new Dimension(WIDTH - 300, HEIGHT));
		text.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		text.setFont(new Font("Calibri", Font.PLAIN, 18));
		text.addKeyListener(this);
		super.add(text);
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getText() {
		return text.getText();
	}

	public void setText(String text) {
		this.text.setText(text);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		// GUI
		if (e.getKeyCode() == (KeyEvent.VK_W) && (e.isControlDown())) {
			System.exit(0);
		}

		// RPG
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			text.setText("");
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(text.getText() != null) {
				parser.react(text.getText());
			}
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
