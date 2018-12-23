import java.nio.channels.GatheringByteChannel;

/**
 * 
 */

/**
 * @author charles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Team<Player> genericTeam = new Team<>("GenericTeam");
		Player footballPlayer = new FootballPlayer("James", 24, "Runningback");
		Player soccerPlayer = new SoccerPlayer("Ralph", 34, 12);
		genericTeam.addPlayer(footballPlayer);
		genericTeam.addPlayer(soccerPlayer);
		System.out.println(genericTeam.listPlayers());
		System.out.println("------------------------------------------------");
		Team<FootballPlayer> ravens = new Team<>("Ravens");
		Player soccerplayer2 = new SoccerPlayer("Neil", 43, 15);
		//ravens.addPlayer(soccerplayer2); //Error due to Team expecting FootballPlayer type
		//Player warren = new FootballPlayer("Warren", 43, "Safety"); //Error will only take FootballPlayer class, not parent class
		FootballPlayer warren = new FootballPlayer("Warren", 43, "Safety");
		FootballPlayer ted = new FootballPlayer("Ted", 34, "Outside Linebacker");
		ravens.addPlayer(warren);
		ravens.addPlayer(ted);
		System.out.println(ravens.listPlayers());

	}

}
