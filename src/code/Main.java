package code;

public class Main 
{
	public static void main(String[] args) throws InterruptedException
	{
		Fight fight = new Fight(new Motor(), new Light(), new Time());
		fight.goToOpponent();
	}
}
