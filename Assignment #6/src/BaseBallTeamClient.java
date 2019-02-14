/**
 * 
 * @author Mikael Hinton
 * 
 *
 */
public class BaseBallTeamClient {

	public static void main(String[] args) {

		/**
		 * TEAM #1
		 */
		String[] players1 = {"Mikael", "Bob", "Tim", "George"
							,"Todd", "Fred", "Seth", "Garrett", "Clint"};
		int [] hits1 =   {1000, 35, 23, 34, 454, 323, 65, 98, 77};
		int [] atBats1 = {3333, 60, 43, 45, 1000, 700, 160, 200, 500};
		
		/**
		 * TEAM #2
		 */
		String[] players2 = {"Mikael", "Bob", "Tim", "George"
				,"Todd", "Fred", "Seth", "Garrett", "Clint"};
		int [] hits2 =   {1000, 35, 23, 34, 454, 323, 65, 98, 77};
		int [] atBats2 = {3333, 60, 43, 45, 1000, 700, 160, 200, 500};
		
		/**
		 * TEAM #3
		 */
		String[] players3 = {"Vick", "Fred", "Tim", "Devin"
							, "Calvin", "Dwayne", "Wes", "Andy", "Vince"};
		int[] hits3 = 	 {543, 566, 43, 67, 54, 76, 876, 54, 56};
		int [] atBats3 = {5555, 9000, 200, 200, 343, 344, 5000, 300, 300}; 
		
		/**
		 * Initializes to objects
		 */
		BaseballTeam Team1 = new BaseballTeam(players1, hits1, atBats1);
		BaseballTeam Team2 = new BaseballTeam(players2, hits2, atBats2);
		BaseballTeam Team3 = new BaseballTeam(players3, hits3, atBats3);

		/**
		 * Outputs the Baseball teams in the right order
		 */
		System.out.println("Baseball Team 1:\n" + Team1);
		System.out.println("Baseball Team 2:\n" + Team2);
		System.out.println("Baseball Team 3:\n" + Team3);
		
		/**
		 *  Tells if the teams are equal or not
		 */
		if(Team1.equals(Team2))
		{
			System.out.println("The hits on Team1 and Team2 are equal");
		}
		else
		{
			System.out.println("They are not equal!");
		}
		if(Team1.equals(Team3))
		{
			System.out.println("The hits on Team1 and Team 2 are equal");
		}
		else
		{
			System.out.println("The hits are not equal on Team1 and Team3!");

		}

		/**
		 * Shows that the getter for players works
		 */
		System.out.println("\nThis gets the names of the players on Team1:\n");
		String [] x = Team1.getPlayers();
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);

		}
		
		/**
		 * Shows that the getter for hits works
		 */
		System.out.println("\nThis gets the hits of the players on Team1:\n");
		int[] xx = Team1.getHits();
		for(int i = 0; i < xx.length; i++)
		{
			System.out.println(xx[i]);

		}
		
		/**
		 * Shows that the getter for atBats works
		 */
		System.out.println("\nThis gets the atBats of the players on Team1:\n");
		int[] xxx = Team1.getAtBats();
		for(int i = 0; i < xx.length; i++)
		{
			System.out.println(xxx[i]);

		}
	
		/**
		 * Shows that total hits works
		 */
		System.out.println("\nThis gets the total hits for Team1!\n");
		System.out.println(Team1.totalHits());
		
		/**
		 * shows how many players are over a .300 batting average
		 */
		System.out.println("\nThis gets how many players on Team1 have a batting average over .300:\n");
		System.out.println(Team1.greatHitters());
	}

}
