package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Health extends JProgressBar {

	private static final long serialVersionUID = 1L;
	private final int WIDTH = 600;
	private final int HEIGHT = 50;
	private final static int MIN = 0;
	private final static int MAX = 100;
	private Border loweredetched;
	private TitledBorder border;
	private double health;
	private Color quarter;
	private Color half;
	private Color full;

	public Health() {
		super(MIN, MAX);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Health", TitledBorder.LEFT, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.PLAIN, 16), Color.black);
		health = MAX;

		System.setProperty("quarter", "0x890000");
		System.setProperty("half", "0XFFCD3F");
		System.setProperty("full", "0X09AF22");

		quarter = Color.getColor("quarter");
		half = Color.getColor("half");
		full = Color.getColor("full");

	}

	public void render() {
		super.setBorder(border);
		super.setMinimumSize(new Dimension(WIDTH - 400, 50));
		super.setPreferredSize(new Dimension(WIDTH, 25));

		// colors
		super.setBackground(Color.lightGray);
		super.setForeground(full);
		super.setStringPainted(true);
		super.setString(health + "%");

		super.setValue(MAX);
		super.setVisible(true);

	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void decreaseHealth(double amount) {
		if (health > MIN) {
			health -= amount; // change variable
			super.setValue((int) health); // change display
			super.setString(health + "%");
		}

		if (health < 50) {
			super.setForeground(half);
		} else if (health < 25) {
			super.setForeground(quarter);
		}
	}

	public void increaseHealth(double amount) {
		if (health < MAX) {
			health += amount; // change variable
			super.setValue((int) health); // change display
			super.setString(health + "%");
		}

		if (health > 50) {
			super.setForeground(full);
		} else if (health > 25) {
			super.setForeground(half);
		} else if (health > 0) {
			super.setForeground(quarter);
		}
	}

}
