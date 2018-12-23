/**
 * 
 */

/**
 * @author charles
 *
 */
public class SoccerPlayer extends Player{
	
	private int runSpeed;

	public SoccerPlayer(String name, int jerseyNumber, int runSpeed) {
		super(name, jerseyNumber);
		this.runSpeed = runSpeed;
	}
	
	public final int getRunSpeed() {
		return runSpeed;
	}
	public final void kickBall() {
		System.out.println(this.getName() + " kicks the ball");
	}
	
	public final String toString() {
		return "Name: " + this.getName() + " JerseyNumber: " + this.getJerseyNumber() + " RunSpeed: " + 
				this.getRunSpeed() + "\n";
	}

}
