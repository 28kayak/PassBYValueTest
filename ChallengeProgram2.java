
public class ChallengeProgram2 
{
	public static void main(String[] args)
	{
		FizzBuzz();
		System.out.println(monkeyTrouble(true, true));
		System.out.println(monkeyTrouble(false, false));
		System.out.println(monkeyTrouble(true, false));
		System.out.println(monkeyTrouble(false, true));
		System.out.println(intMax(1,2,3));
		System.out.println(intMax(2,3,1));
		System.out.println(intMax(3,2,1));
		
	}
	public static void FizzBuzz()
	{
		for(int i = 0; i <= 100; i++)
		{
			if(i%3 == 0 && i%5 ==0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i%3 == 0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		if(aSmile == true)
		{
			if(bSmile==true)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(bSmile == false)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static int intMax(int a, int b, int c)
	{
		int max = a;
		if(max <= b)
		{
			max = b;
		}
		if(max <= c)
		{
			max = c;
		}
		return max;
	}
	

}
