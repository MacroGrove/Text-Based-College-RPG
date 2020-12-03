import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Hunger extends JProgressBar {

	private static final long serialVersionUID = 1L;
	private final int WIDTH = 600;
	private final int HEIGHT = 50;
	private final static int MIN = 0;
	private final static int MAX = 100;
	private Border loweredetched;
	private TitledBorder border;
	private int hunger;
	private Color quarter;
	private Color half;
	private Color full;

	public Hunger() {
		super(MIN, MAX);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Hunger", TitledBorder.LEFT, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.PLAIN, 16), Color.black);
		hunger = MIN;

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
		super.setString(hunger + "%");


		super.setValue(MIN);
		super.setVisible(true);

	}

	public int getHunger() {
		return hunger;
	}

	public void setHUnger(int fitness) {
		this.hunger = fitness;
	}

	public void decreaseHunger(int amount) {
		if (hunger != MIN) {
			hunger -= amount; // change variable
			super.setValue(hunger); // change display
			super.setString(hunger + "%");
		}

		if (hunger == MAX / 2) {
			super.setForeground(half);
		} else if (hunger == MAX / 2) {
			super.setForeground(full);
		}
	}

	public void increaseHunger(int amount) {
		if (hunger != MAX) {
			hunger += amount; // change variable
			super.setValue(hunger); // change display
			super.setString(hunger + "%");
		}
		
		if (hunger == MAX / 2) {
			super.setForeground(full);
		} else if (hunger == MAX / 4) {
			super.setForeground(half);
		}
	}

}
