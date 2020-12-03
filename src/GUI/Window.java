package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 1250;
	private final int HEIGHT = 685;
	private Output left;
	private Status right;
	private Parser parser;
	private Input bottom;

	public Window() {
		super("Grove City College Role Playing Game 1.0.0");
		left = new Output();
		right = new Status();
		parser = new Parser(left, right);
		bottom = new Input(parser);

	}

	/**
	 * 
	 */
	public void render() {
		super.setLayout(new BorderLayout());

		left.render();
		right.render();
		bottom.render();

		left.setBackground(Color.lightGray);
		right.setBackground(Color.lightGray);
		bottom.setBackground(Color.lightGray);
		super.getContentPane().setBackground(Color.lightGray);

		super.add(left, BorderLayout.CENTER);
		super.add(right, BorderLayout.LINE_END);
		super.add(bottom, BorderLayout.PAGE_END);

		super.setResizable(true);
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		super.pack();
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);

	}

	public void play() {

		while (true) {
			super.validate();
		}

	}

}
