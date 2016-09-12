
public abstract class Player {
	public Player() {
		super();
	}

	private String playerName;

	public abstract Roshambo generateRoshambo();

	public Player(String playerName) {
		this.setPlayerName(playerName);
	}

	public static final String ROCK = "rock";
	public static final String RANDOM = "random";

	private String rock;
	private String random;

	public Player(String rock, String random) {
		this.rock = rock;
		this.random = random;

	}

	public String getRock() {
		return rock;
	}

	public void setRock(String rock) {
		this.rock = rock;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getInformation(String choice) throws IllegalArgumentException {
		if (ROCK.equalsIgnoreCase(choice)) {
			return getRock();
		} else if (RANDOM.equalsIgnoreCase(choice)) {
			return getRandom();
		} else {
			throw new IllegalArgumentException("You may only play against rock or random.");
		}
	}

}
