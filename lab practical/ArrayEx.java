import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayEx {

	public static void main(String[] args) {
	List l=new ArrayList();
	l.add("Akram");
	l.add("aa");
	l.add(18);
	l.add(5);
	l.add("anudip");

      System.out.println("Element after add:"+" "+l);
   
     l.remove(3);
      System.out.println("Element after remove:"+" "+l);
   
     Iterator it=l.iterator();
     while (it.hasNext())
  {
       System.out.println("Retrieve element:"+" "+it.next());
	}
	}
}