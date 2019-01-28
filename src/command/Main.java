package command;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		commandClient();
	}

	private static void commandClient() {
		List<ICommand> commands = new ArrayList<ICommand>();
		commands.add(new PrintMessageCommand("Command Design Pattern"));
		commands.add(new PrintInfoMessageCommand("This is an info Message"));
		commands.add(new PrintErrorMessageCommand("This is an Error Message"));
		new Executor().execute(commands);
	}
	
}
