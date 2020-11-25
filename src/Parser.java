
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

	}

}
