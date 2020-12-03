package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Status extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 625;
	private final int HEIGHT = 525;
	private final int ROWS = 10;
	private final int COLS = 0;
	private Border loweredetched;
	private TitledBorder border;
	private Health health;
	private Wakefulness wakefulness;
	private Fitness fitness;
	private Hunger hunger;
	private Thirst thirst;

	public Status() {
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		border = BorderFactory.createTitledBorder(loweredetched, "Status", TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
				new Font("Calibri", Font.PLAIN, 16), Color.black);
		health = new Health();
		wakefulness = new Wakefulness();
		fitness = new Fitness();
		hunger = new Hunger();
		thirst = new Thirst();
	}

	/**
	 * 
	 */
	public void render() {
		super.setBorder(border);
		super.setMinimumSize(new Dimension(WIDTH - 300, HEIGHT - 200));
		super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		super.setLayout(new GridLayout(ROWS, COLS));

		health.render();
		fitness.render();
		hunger.render();
		thirst.render();
		wakefulness.render();
		super.add(health, 0, 0);
		super.add(wakefulness, 1, 1);
		super.add(fitness, 2, 2);
		super.add(hunger, 3, 3);
		super.add(thirst, 4, 4);
	}

	public Health getHealth() {
		return health;
	}

	public Wakefulness getWakefulness() {
		return wakefulness;
	}

	public Fitness getFitness() {
		return fitness;
	}
	
	public Hunger getHunger() {
		return hunger;
	}
	
	public Thirst getThirst() {
		return thirst;
	}

}
