import java.util.ArrayList;


/**
 * 
 */

/**
 * @author charles
 *
 */
public class Team<T> {
	private ArrayList<T> team;
	private String name;
	private int wins;
	private int loses;
	
	public Team(String name) {
		this.team = new ArrayList<>();
		this.name = name;
		this.wins = 0;
		this.loses = 0;
		
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if (team.contains(player)) {
			System.out.println("Player is already on " + this.getName());
			return false;
		}else {
			team.add(player);
			return true;
		}
	}
	
	public String listPlayers() {
		StringBuilder stringBuilder = new StringBuilder();
		for(T player: team) {
			stringBuilder.append(player.toString());
		}
		String outputString = stringBuilder.toString();
		return outputString;
	}
	

	
	
}
