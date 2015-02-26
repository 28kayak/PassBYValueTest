
public class ChallengeProgram
{//To prove java is only allowed pass by value

	public static void main(String[] args)
	{
		int[] arr = new int [5];
		for(int i = 0; i < arr.length; i++)
		{//initialize 
			arr[i] = i;
		}
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println("arr = " + arr[i]);
		}
		increment1(arr);
		//print the original arr
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println("arr = " + arr[i]);
		}
		arr = increment2(arr);
		int[] arr2 = new int[5];
		arr2 = increment2(arr);
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println("arr = " + arr[i]);
		}
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println("arr2 = " + arr2[i]);
		}
		
	}
	public static void increment1(int[] array)
	{
		System.out.println("in increment1 function");
		for(int i = 0; i < array.length; i++)
		{
			array[i] += 1;
			System.out.println("array[i] = " + array[i]);
		}
		
	}
	public static int[] increment2(int[] array)
	{
		System.out.println("in increment2 function");
		for(int i = 0; i < array.length; i++)
		{
			array[i] += 1;
			System.out.println("array[i] = " + array[i]);
		}
		return array;
	}	

}
