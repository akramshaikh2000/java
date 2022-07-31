import java.io.*;
class FlieInputStreamprac
{
 public static void main(String[] args)
   { 
      try
         {
           FileInputStream fn = new FileInputStream("C:\\Users\\Dell\\Desktop\\choice.txt");
  	   int a;
	   System.out.println("After skiping the file content:");
           fn.skip(3);
	   while((a=fn.read())!=-1)
              {
	          System.out.print((char)a);
              }
           fn.close();
          }
          catch(Exception ex)
               {
 		  System.out.println(ex); 
	       }
   }
}