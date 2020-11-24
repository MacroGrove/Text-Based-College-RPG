
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame {

	private Output left;
	private Status right;
	private Input bottom;

	public Window() {
		super("Window");
		left = new Output();
		right = new Status();
		bottom = new Input();
	}

//	public Window(String title) {
//		super(title);
//
//	}

	/**
	 * 
	 */
	public void render() {
		super.setLayout(new BorderLayout());

		left.render();
		right.render();
		bottom.render();

//		left.setBackground(Color.getHSBColor(0, 100, 53));
//		right.setBackground(Color.getHSBColor(0, 100, 53));
//		bottom.setBackground(Color.getHSBColor(0, 100, 53));
		left.setBackground(Color.DARK_GRAY);
		right.setBackground(Color.DARK_GRAY);
		bottom.setBackground(Color.DARK_GRAY);
		super.getContentPane().setBackground(Color.DARK_GRAY);

		super.add(left, BorderLayout.CENTER);
		super.add(right, BorderLayout.LINE_END);
		super.add(bottom, BorderLayout.PAGE_END);

		super.setResizable(true);
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);

	}

}
