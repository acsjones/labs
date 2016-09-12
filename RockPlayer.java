
public class RockPlayer extends Player {

	public RockPlayer(String playerName) {
		super(playerName);
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.ROCK;
	}

}
