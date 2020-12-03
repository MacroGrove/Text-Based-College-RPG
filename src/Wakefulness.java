import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Wakefulness extends JProgressBar {

	private static final long serialVersionUID = 1L;
	private final int WIDTH = 600;
	private final int HEIGHT = 50;
	private final static int MIN = 0;
	private final static int MAX = 100;
	private Border loweredetched;
	private TitledBorder border;
	private int wakefulness;
	private Color quarter;
	private Color half;
	private Color full;

	public Wakefulness() {
		super(MIN, MAX);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Wakefulness", TitledBorder.LEFT,
				TitledBorder.ABOVE_TOP, new Font("Calibri", Font.PLAIN, 16), Color.black);
		wakefulness = MAX;

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
		super.setString(wakefulness + "%");

		super.setValue(MAX);
		super.setVisible(true);

	}

	public int getHealth() {
		return wakefulness;
	}

	public void setHealth(int health) {
		this.wakefulness = health;
	}

	public void decreaseHealth(int amount) {
		if (wakefulness != MIN) {
			wakefulness -= amount; // change variable
			super.setValue(wakefulness); // change display
			super.setString(wakefulness + "%");
		}

		if (wakefulness == MAX / 2) {
			super.setForeground(half);
		} else if (wakefulness == MAX / 4) {
			super.setForeground(quarter);
		}
	}

	public void increaseHealth(int amount) {
		if (wakefulness != MAX) {
			wakefulness += amount; // change variable
			super.setValue(wakefulness); // change display
			super.setString(wakefulness + "%");
		}
		
		if (wakefulness == MAX / 2) {
			super.setForeground(full);
		} else if (wakefulness == MAX / 4) {
			super.setForeground(half);
		}
	}

}
