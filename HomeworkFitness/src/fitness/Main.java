package fitness;

public class Main {

	public static void main(String[] args) {
		Instructor instructor =new Instructor();
		Trainee trainee = new Trainee();
		
		Spectator spectator1 = new Spectator();
		Spectator spectator2 = new Spectator();
		Spectator spectator3 = new Spectator();
		
		trainee.subscribe(spectator1);
		trainee.subscribe(spectator2);
		trainee.subscribe(spectator3);
		
		Command changeExerciseToLieDown = new LieDown(trainee);
		Command changeExerciseToStandUp = new StandUp(trainee);
		
		instructor.setCommand(changeExerciseToLieDown);
		instructor.changeExercise();
		
		instructor.setCommand(changeExerciseToStandUp);
		instructor.changeExercise();
	}
}
