/**
 * 
 * @author Mikael Hinton
 *
 */
public class BaseballTeam {

	/**
	 *  A number of players which is 9.
	 */
	static int numPlayers = 9;
	
	/**
	 * A list of player names
	 */
	private String [] players;
	
	/**
	 * A list of number of hits for each player
	 */
	private int [] hits;
	
	/**
	 * A list of number of at-bats for each player
	 */
	private int [] atBats;
	
	/**
	 * A constructor that instanciates a BaseballTeam and initializes the attributes
	 * @param newPlayers
	 * @param newHits
	 * @param newAtBats
	 */
	BaseballTeam(String [] newPlayers, int [] newHits, int [] newAtBats)
	{
		players = newPlayers;
		hits = newHits;
		atBats = newAtBats;
	}
	
	/**
	 * Gets the players name
	 * @return tempPlayers
	 */
	public String [] getPlayers()
	{
		String [] tempPlayers = new String[numPlayers];
		for(int i = 0; i < players.length; i++)
		{
			tempPlayers[i] = players[i];
		}
		return tempPlayers;
	}
	
	/**
	 * Gets the hits for each player
	 * @return tempHits
	 */
	public int [] getHits()
	{
		int[] tempHits = new int[numPlayers];
		for(int i = 0; i < hits.length; i++)
		{
			tempHits[i] = hits[i];
		}
		return tempHits;
	}
	
	/**
	 * Gets the at-bats for each player
	 * @return tempBats
	 */
	public int [] getAtBats()
	{
		int[] tempBats = new int[numPlayers];
		for(int i = 0; i < atBats.length; i++)
		{
			tempBats [i] = atBats[i];
		}
		return tempBats;
	}
	
	/**
	 * Sets the players names
	 * @param _players
	 */
	public void setPlayers(String [] _players)
	{
		players = new String[_players.length];
	}
	
	/**
	 * sets the hits
	 * @param _hits
	 */
	public void setHits(int[] _hits)
	{
		hits = new int[_hits.length];
	}
	
	/**
	 * sets the atBats
	 * @param _atBats
	 */
	public void setAtBats(int[] _atBats)
	{
		atBats = new int[_atBats.length];
	}
	
	/**
	 * Outputs the players name, hits and atBats all 
	 * at the same time
	 */
	public String toString()
	{
		String value = " ";
		for(int i = 0; i < hits.length; i++)
		{
			value = value + players[i] + "\t" + hits[i] + "\t" + atBats[i] +"\n";
		}
	return value;
	}
	
/**
 * Compares 2 of the baseball teams and sees if they are equal or not
 */
	public boolean equals(Object team)
	{
		if(!(team instanceof BaseballTeam))
		{
			return false;
		}
		else
		{
			BaseballTeam client = (BaseballTeam) team;
			if(numPlayers != client.numPlayers)
			{
				return false;
			}
			for(int i = 0; i < players.length; i++)
			{
				if(players[i] != client.players[i])
				{
					return false;
				}
			}
			for(int i = 0; i < atBats.length; i++)
			{
				if(atBats[i] != client.atBats[i])
				{
					return false;
				}
			}
			for(int i = 0; i < hits.length; i++)
			{
				if(hits[i] != client.hits[i])
				{
					return false;
				}
			}
			return true;
		}
	}
	
	/**
	 * Gets the batting average of the players
	 * @return avg
	 */
	public double [] battingAverages()
	{
		double[] avg = new double[numPlayers];
		for(int i = 0; i < numPlayers; i++)
		{
			if(atBats[i] == 0)
			{
				avg[i] = 0;
			}
			else
			{
				avg[i] = (double) (atBats[i] / hits[i]);
			}
		}
	return avg;
	}
	
	/**
	 * get the total hits of the team
	 * @return total
	 */
	public int totalHits()
	{
		int total = 0;
		for(int i = 0; i < numPlayers; i++)
		{
			total = total + hits[i];
		}
	return total;
	}
	
	/**
	 * counts and returns how many players have a batting average over .300
	 * @return count
	 */
	public int greatHitters()
	{
		double avg[] = battingAverages();
		int count = 0;
		for(int i = 0; i < numPlayers; i++)
		{
			if(avg[i] > 0.300)
			{
				count++;
			}
		}
	return count;
	}
}
