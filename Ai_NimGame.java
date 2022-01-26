import java.lang.*;

public class Ai_NimGame
{
      boolean  win=false;
	  int x;
	  boolean taunt=false;


	
		public int FinalChoice(int Stones)
		{
			if(Stones>=1 && Stones<=3)
			{
				if(Stones-1==0)
					return 1;
				else if(Stones-2==0)
					return 2;
				else
					return 3;
			}
			
			else{
			
						if (	YourChoice((Stones-1)-(EnemyChoice(Stones-1)))	)
						{	
							displayTaunt();
							display(1);
							return 1;
						}
						
						else if (YourChoice((Stones-2)-(EnemyChoice(Stones-2))))
						{  	
							displayTaunt();
							display(2);
							return 2;
						}
						
						else if( YourChoice( (Stones-3) -( EnemyChoice(Stones-3) )))
						{	displayTaunt();
							display(3);		
							return 3;
						}

						else
						{
							int temp=(int)Math.ceil( Math.random()*3);
							displayFrustration();
							display(temp);
							return temp; 
							//random number 1,2,3 as it is already a lost game 
							//if playing alongside Ai or are you an Ai
						}
				}
		}//End of FinalChoice()
	

	  

   	boolean YourChoice(int Stones)
	{
		if(Stones==0)
		win=false;
		
		else if(Stones>=1 && Stones<=3)
		win=true;
		
		else
		{
			if( 	
			YourChoice( (Stones-1)-EnemyChoice(Stones-1) )   ||	
			YourChoice( (Stones-2)-EnemyChoice(Stones-2) )  ||  
			YourChoice( (Stones-3)-EnemyChoice(Stones-3) )	
			)
			win=true;
			
			else
			win=false;
		}
		
		return win;

	} //End of YourChoice()



	int EnemyChoice(int Stones)
	{
		if(Stones>=1 && Stones<=3)
		{
			if(Stones-1==0)
			x=1;
			
			else if(Stones-2==0)
			x=2;
			
			else
			x=3;
		
		}

		
		else
		{
			if( YourChoice((Stones-1)-(EnemyChoice(Stones-1)))  )
			x=1;

			else if( YourChoice((Stones-2)-(EnemyChoice(Stones-2))) )
			x=2;
			
			else if(  YourChoice( (Stones-3) -( EnemyChoice(Stones-3) ))  )
			x=3;

			else
			x=(int)Math.ceil( Math.random()*3); 
		//random number 1,2,3 as it is already a lost game
		}
		return x;



			
	}//End of EnemyChoice()



   void display(int RemoveStones)
{
 System.out.printf("Ai has chosen to remove %d stones \n",RemoveStones);
}//End of Display()


void displayTaunt()
{
if(taunt==false)
	{
		System.out.println("Ai:This is to tell my fellow opponent you have 0% of winning now");
		taunt=true;
	} 
}//End of DisplayTaunt()


void displayFrustration()
{
	switch((int)Math.ceil( Math.random()*5))
	{
		case 1:
		System.out.println("Ai:You had the better luck");
		break;
		
		case 2:
		System.out.println("Ai:How could you!!!");
		break;

		case 3:
		System.out.println("Ai:Ergggggggg! T.T");
		break;

		case 4:
		System.out.println("Ai:How long can you last,until.....");
		break;
	
		case 5:
		System.out.println("Ai:Such Mockery!!!! ");
		break;
	}
}//End of DisplayFunction()



}//End of Class Ai_NimGame