package command;

public class PrintErrorMessageCommand implements ICommand {

	private String message;
	
	public PrintErrorMessageCommand(String message) {
		this.message = message;
	}
	
	@Override
	public void execute() {
		System.out.println("ERROR: " + message);
	}

}
