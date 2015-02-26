
public class PassingTest
{
	public static void main(String[] args)
	{
		System.out.println("Hello, wrold");
		int x = 5;
		add(x);
		System.out.println("x = " + x);
		
	}
	static void add(int a)
	{
		a = a + 3;
		System.out.println("In function, result = " + a);
	}
	

}
/***
 * Historical reason 
 * Java use only pass by value because Java is invented for web programming.
 * pass by reference is needed to know exact address where the value is stored. 
 * However, for web programming, we can not share an exact memory address to use the value stored.
 * So, to know the value stored without knowing the exact memory address, java use pass by value. Not pass by reference. 
 */

