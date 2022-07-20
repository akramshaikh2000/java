interface Big
	{
	final int b=7;
	void display();

	}
interface Big1
	{
	final int c=9;
	void show();

	}
class Testclass implements Big,Big1
	{
	public void display()
		{	
		System.out.println("Boy: "+b);
		}		

	public void show()
		{	
		System.out.println("Girl: "+c);
		}		
	public static void main(String args[])
		{	
		Testclass t=new Testclass();
		t.display();	t.show();
		
		}
	}