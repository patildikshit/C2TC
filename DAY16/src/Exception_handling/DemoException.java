package Exception_handling;

public class DemoException {

	public static void main(String[] args)
	{
		
		int num=50/2;
		System.out.println(num);
		
		int num1=50/10;
		System.out.println(num1);
		try
		{
		int num2=50/0;
		System.out.println(num2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int num3=50/25;
		System.out.println(num3);

	}

}

/*public class TestMultipleCatchBlock
{		
	public static void main(String args[])
{		
	 try
{		
			int a[]=new int[5];		
			a[5]=30/0;		
	 }		
	 catch(ArithmeticException e)
{
System.out.println("task1 is completed");
}		
	 catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("task 2 completed");
}		
	 catch(Exception e)
{
System.out.println("common task completed");
}				
	 System.out.println("rest of the code...");		
}		
}
*/