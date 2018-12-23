/**
 * 
 */

/**
 * @author charl
 *
 */
public abstract class Player {
	String name;
	int jerseyNumber;
	
	public Player(String name, int jerseyNumber) {
		super();
		this.name = name;
		this.jerseyNumber = jerseyNumber;
	}

	public final String getName() {
		return name;
	}

	public final int getJerseyNumber() {
		return jerseyNumber;
	}

	public final void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public String toString() {
		return "Name: " + this.getName() + " JerseyNumber: " + this.getJerseyNumber();
		
	}
	
	
}
