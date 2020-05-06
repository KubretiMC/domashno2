package fitness;

public class Instructor {
	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void changeExercise() {
		System.out.println("Instructor changed exercise.");
		this.command.execute();
	}
}
		