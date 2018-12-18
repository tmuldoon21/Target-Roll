import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Tyler Muldoon
 *Target Roll
 */
public class TargetRoll 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter the number you are trying to roll with the die (1-6): ");
		int num = user.nextInt();
		int loopNum = 0;
		Random ran = new Random();
		int rand = ran.nextInt(6) + 1;
		while (num < 1 || num > 6)
		{
			System.out.println("The number you have entered is invalid, please try again.");
			System.out.print("Please enter the number you are trying to roll with the die (1-6): ");
			num = user.nextInt();
		}
		while (num != rand)
		{
			System.out.println("You rolled the number " + rand);
			rand = ran.nextInt(6) + 1;
			loopNum ++;
		}
		System.out.println(" It took you " + loopNum + " attempts to roll your number");
	}

}
