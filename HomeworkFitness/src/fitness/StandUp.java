package fitness;

public class StandUp implements Command {

	private Trainee trPerson;
	
	public StandUp(Trainee trainee) {
		this.trPerson=trainee;
	}
	@Override
	public void execute() {
		trPerson.setTraining("Get up");
	}

}
