public class TeamViewer {

	public static void main(String[] args) {

		Team men = new Team();
		Team women = new Team();
		Team freshers = new Team();
		TredzIT.addTeam(men);
		TredzIT.addTeam(women);
		TredzIT.addTeam(freshers);

	}

}

abstract class TredzIT {

	static String organisation = "TredzIT";
	private static Team[] teams = new Team[3];

	public static void addTeam(Team t) {
	};

}

class Team {
	private String teamName;
	private String teamDistinction; // based on gender or based on years of
									// experience, post etc...
	private Player captain;
	private Player[] allPlayers;
	private int matchesWon;
	private int matchesLost;
	private int matchesPlayed;

	public void addPlayer(Player m) {
	};

	public void remPlayer(Player m) {
	};

	public void listPlayers() {

	};

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Player getCaptain() {
		return captain;
	}

	public void setCaptain(Player captain) {
		this.captain = captain;
	}

	public Player[] getAllPlayers() {
		return allPlayers;
	}

	public void setAllPlayers(Player[] allPlayers) {
		this.allPlayers = allPlayers;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public int getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

}

abstract class Player {
	private String name;

}

class Batsman extends Player {
	private int runsScored;
}

class Bowler extends Player {
	private int wicketsTaken;
}

class WicketKeeper extends Player {

}

class AllRounder extends Player {

}