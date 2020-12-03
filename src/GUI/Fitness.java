import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Fitness extends JProgressBar {

	private static final long serialVersionUID = 1L;
	private final int WIDTH = 600;
	private final int HEIGHT = 50;
	private final static int MIN = 0;
	private final static int MAX = 100;
	private Border loweredetched;
	private TitledBorder border;
	private double fitness;
	private Color quarter;
	private Color half;
	private Color full;

	public Fitness() {
		super(MIN, MAX);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Fitness", TitledBorder.LEFT, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.PLAIN, 16), Color.black);
		fitness = MIN;

		System.setProperty("quarter", "0x890000");
		System.setProperty("half", "0XFFCD3F");
		System.setProperty("full", "0X09AF22");

		quarter = Color.getColor("quarter");
		half = Color.getColor("half");
		full = Color.getColor("full");
	}

	public void render() {
		super.setBorder(border);
		super.setMinimumSize(new Dimension(WIDTH - 400, HEIGHT));
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT - 25));

		// colors
		super.setBackground(Color.lightGray);
		super.setForeground(quarter);
		super.setStringPainted(true);
		super.setString(fitness + "%");

		super.setValue(MIN);
		super.setVisible(true);

	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}

	public void decreaseFitness(double amount) {
		if (fitness > MIN) {
			fitness -= amount; // change variable
			super.setValue((int) fitness); // change display
			super.setString(fitness + "%");
		}

		if (fitness < 50) {
			super.setForeground(half);
		} else if (fitness < 25) {
			super.setForeground(quarter);
		}
	}

	public void increaseFitness(double amount) {
		if (fitness < MAX) {
			fitness += amount; // change variable
			super.setValue((int)fitness); // change display
			super.setString(fitness + "%");
		}

		if (fitness > 50) {
			super.setForeground(full);
		} else if (fitness > 25) {
			super.setForeground(half);
		} else {
			super.setForeground(quarter);
		}
	}

}
