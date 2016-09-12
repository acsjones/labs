
public abstract class Player {
	public Player() {
		super();
	}

	private String playerName;

	public abstract Roshambo generateRoshambo();

	public Player(String playerName) {
		this.setPlayerName(playerName);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
