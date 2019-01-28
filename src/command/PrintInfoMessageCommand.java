package command;

public class PrintInfoMessageCommand implements ICommand {

	private String message;
	
	public PrintInfoMessageCommand(String message) {
		this.message = message;
	}
	
	@Override
	public void execute() {
		System.out.println("INFO: " + message);
	}

}
