import java.util.*;

class Nim_Game
{
	public static void main(String args[])
	{	Ai_NimGame ai=new Ai_NimGame();
		Scanner sc=new Scanner(System.in);
		int player1=0;
		int player2=0;
		
		while(true)
		{	
	
			System.out.println("Game of Nim");
			System.out.println("You can take 1 ,2 or 3 sticks");
			System.out.println("Give the number of Starting Stones");
			int n_stones=sc.nextInt();
				while(n_stones!=0)
				{
					System.out.println("How many Stones would the Player like to remove \n");
					playerChoice=0;
					while (playerChoice<=0 && playerChoice>3)
					{
						playerChoice=sc.nextInt();
						if (playerChoice <=0  && playerChoice>=3)
						{
							System.out.println("Error Give a valid number between 1-3 inclusive");
						}
					}
					
					n_stones=n_stones-playerChoice;
					
					if(n_stones==0)
					{
					System.out.println("Player 1 wins \n");
					break;
					}
					System.out.println("No of stones Left:"+n_stones+"\n");
		
					System.out.println("How many Stones would the Ai like to remove \n");
					n_stones=n_stones-ai.FinalChoice(n_stones);
					if(n_stones==0)
					{
					System.out.println("Ai wins\n");
					break;
					}
					System.out.println("No of stones Left:"+n_stones+"\n");
				
					
						
				}
		}
		
		
	}
	
	
}
