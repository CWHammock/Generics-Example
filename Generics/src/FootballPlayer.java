/**
 * 
 */

/**
 * @author charles
 *
 */
public class FootballPlayer extends Player{
	
	String position;
	
	public FootballPlayer(String name, int jerseyNumber, String position) {
		super(name, jerseyNumber);
		this.position = position;
	}
	
	public final String getPosition() {
		return this.position;
	}
	
	public final void throwsPigSkin() {
		System.out.println(this.getName() + " throws the pigskin...");
	}
	
	public final String toString() {
		return "Name: " + this.getName() + " JerseyNumber: " + this.getJerseyNumber() + " Position: " + 
				this.getPosition() + "\n";
	}
	
}
