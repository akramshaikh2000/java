import java.util.Random;
	
	class square extends Thread
	{
		int a;
		square(int n)
		{
			a=n;
		}
		public void run()
		{
			System.out.println("Random Number : "+a);
			System.out.println("The Thread :  "+a+" is Even and square of the number :"+(a*a));
			System.out.println("------------------------------------------------");
			
		}
	}
	class cube extends Thread
	{
		int a;
		cube(int n)
		{
			a=n;
		}
		public void run()
		{
			System.out.println("Random Number : "+a);
			System.out.println("The Thread  : "+a+" is Odd and cube of the number :"+(a*a*a));
			System.out.println("----------------------------------------------");
		}	
	}
	 
	class RandomNumber extends Thread
	{
		public void run()
		{  Random r=new Random();
			for(int i=0;i<5;i++)
			{
				int n=r.nextInt(50);
				if(n%2==0)
				{
					square s=new square(n);
					s.start();
				}
				else
				{
					cube c=new cube(n);
					c.start();	
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public class ThreadExample1 extends Thread {

		public static void main(String[] args) {
			RandomNumber r=new RandomNumber();
			r.start();

		}
	}
	

