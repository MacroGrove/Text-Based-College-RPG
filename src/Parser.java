
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

		if (action.equalsIgnoreCase("eat")) {
			status.getHealth().increaseHealth(1);
		} else if (action.equalsIgnoreCase("sleep")) {
			status.getHealth().increaseHealth(1);
		}

		if (action.equalsIgnoreCase("study")) {
			status.getHealth().decreaseHealth(1);
		}

	}

	private void checkFitness(String action) {

		if (action.equalsIgnoreCase("bench")) {
			status.getFitness().increaseFitness(1);
		} else if (action.equalsIgnoreCase("chin up")) {
			status.getFitness().increaseFitness(1);
		} else if (action.equalsIgnoreCase("pull up")) {
			status.getFitness().increaseFitness(1);
		} else if (action.equalsIgnoreCase("run")) {
			status.getFitness().increaseFitness(25);
		} else if(action.equalsIgnoreCase("swim")) {
			status.getFitness().increaseFitness(50);
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
