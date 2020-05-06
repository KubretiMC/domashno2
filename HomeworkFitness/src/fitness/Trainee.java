package fitness;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
	private String exercise;
	private List<Spectator> spectators = new ArrayList<Spectator>();
	
	public void setTraining(String exercise)
	{
		this.exercise=exercise;
		int spectatorCounter=1;
		System.out.println("Training person changed exercise to "+this.exercise);
		for(Spectator spectator: this.spectators)
		{
			spectator.setExercise(this.exercise);
			System.out.println("Spectator "+spectatorCounter+" changed exercise to "+this.exercise);
			spectatorCounter++;
		}
	
	}
		
	public void subscribe(Spectator spectator)
	{
		this.spectators.add(spectator);
	}
}
