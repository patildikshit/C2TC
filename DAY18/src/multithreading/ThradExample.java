package multithreading;
class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id" +Thread.currentThread().getId());
	}
}
class MSEdgc extends Thread
{
	public void run()
	{
		System.out.println("MSEdgc id" +Thread.currentThread().getId());
	}
}

class OutLook extends Thread
{
	public void run()
	{
		System.out.println("Outlook id" +Thread.currentThread().getId());
	}
}


public class ThradExample 
{

	public static void main(String[] args)
	{
		Eclipse ob=new Eclipse();
		ob.start ();	
		
		 MSEdgc ob1=new  MSEdgc();
		ob1.start ();		
		
		OutLook ob2=new OutLook();
		ob2.start ();		



	}

}
