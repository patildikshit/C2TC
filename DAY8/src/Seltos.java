
abstract class Mumbai_Rules
{
	abstract void speedlimit();
	abstract void rashdriving();
	void slowmoving()
	{
		System.out.println("no fine");
	}
}
public class Seltos extends Mumbai_Rules
{
     void speedlimit()
     {
    	System.out.println("The limit is 80") ;
     }
     void rashdriving()
     {
    	 System.out.println("Alert voice");
     }
	public static void main(String[] args){
	
		 Seltos s=new Seltos();
		 s.speedlimit();
		 s.rashdriving();
		 s.slowmoving();

	}

}
