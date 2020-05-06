package fitness;

public class LieDown implements Command {

	private Trainee trainee;
	
	public LieDown(Trainee trainee) {
		this.trainee=trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Lie down");
	}
}


