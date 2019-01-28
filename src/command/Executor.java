package command;

import java.util.List;

public class Executor {

	public void execute(List<ICommand> commands) {
		for (ICommand iCommand : commands) {
			iCommand.execute();
		}		
	}
	
}
