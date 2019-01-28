package command;

public class PrintMessageCommand implements ICommand {

	private String message;
	
	public PrintMessageCommand(String message) {
		this.message = message;
	}
	
	@Override
	public void execute() {
		System.out.println(message);
	}

}
