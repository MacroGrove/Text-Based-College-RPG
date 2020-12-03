package GUI;

public class Parser {

	private Output output;
	private Status status;

	public Parser(Output output, Status status) {
		this.output = output;
		this.status = status;
	}

	public void react(String action) {

		if (action.equalsIgnoreCase("hello")) {
			output.addMessage("How are you?");
		}

		checkHealth(action);
		checkFitness(action);
		checkClose(action);

	}

	private void checkHealth(String action) {

		if (action.equalsIgnoreCase("eat")) { // up
			status.getHealth().increaseHealth(0.5);
			status.getWakefulness().increaseWakefulness(0.5);
			status.getHunger().decreaseHunger(1);
			status.getThirst().increaseThirst(1);
			output.addMessage("You ate some food.");
		} else if (action.equalsIgnoreCase("sleep")) {
			status.getHealth().increaseHealth(1);
			status.getWakefulness().increaseWakefulness(1);
			status.getHunger().increaseHunger(2);
			status.getThirst().increaseThirst(2);
			output.addMessage("You slept an hour.");
		} else if (action.equalsIgnoreCase("study")) {
			status.getHealth().decreaseHealth(1);
			status.getWakefulness().decreaseWakefulness(2);
			status.getHunger().increaseHunger(2);
			status.getThirst().increaseThirst(2);
			output.addMessage("You studied for an hour.");
		} else if (action.equalsIgnoreCase("fast")) { // down
			status.getHealth().decreaseHealth(1);
			status.getWakefulness().decreaseWakefulness(1);
			status.getHunger().increaseHunger(1);
			status.getThirst().increaseThirst(0.5);
		} else if (action.equalsIgnoreCase("drink")) {
			status.getHunger().decreaseHunger(0.5);
			status.getThirst().decreaseThirst(1);
			output.addMessage("You drank some water.");
		}

	}

	private void checkFitness(String action) {

		if (action.equalsIgnoreCase("bench")) {
			status.getFitness().increaseFitness(1);
			status.getWakefulness().decreaseWakefulness(1);
			status.getHunger().increaseHunger(1);
			status.getThirst().increaseThirst(1);
		} else if (action.equalsIgnoreCase("curl")) {
			status.getFitness().increaseFitness(1);
			status.getWakefulness().decreaseWakefulness(1);
			status.getHunger().increaseHunger(0.25);
			status.getThirst().increaseThirst(0.25);
		} else if (action.equalsIgnoreCase("pull")) {
			status.getFitness().increaseFitness(1);
			status.getWakefulness().decreaseWakefulness(1);
			status.getHunger().increaseHunger(1);
			status.getThirst().increaseThirst(1);
		} else if (action.equalsIgnoreCase("run")) {
			status.getFitness().increaseFitness(5);
			status.getWakefulness().decreaseWakefulness(1);
			status.getHunger().increaseHunger(1);
			status.getThirst().increaseThirst(2);
		} else if (action.equalsIgnoreCase("swim")) {
			status.getFitness().increaseFitness(5);
			status.getWakefulness().decreaseWakefulness(1);
			status.getHunger().increaseHunger(1);
			status.getThirst().increaseThirst(1);
		}

	}

	private void checkClose(String action) {

		if (action.equalsIgnoreCase("close")) {
			System.exit(0);
		} else if (action.equalsIgnoreCase("exit")) {
			System.exit(0);
		} else if (action.equalsIgnoreCase("finish")) {
			System.exit(0);
		}

	}

}
