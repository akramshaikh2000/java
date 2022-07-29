import java.util.StringTokenizer;    
public class StringTokenizerprac  
{    
  
 public static void main(String args[])  
{    
   
   String st ="My Name Is Mohammed Akram";    
   StringTokenizer s =new StringTokenizer(st);   
   while (s.hasMoreTokens())   
    {    
         
         System.out.println(s.nextToken());
    }
         System.out.println("String length is:" + st.length());
         System.out.println("Upper case is:" + st.toUpperCase());
         System.out.println("Index no at character 'N' is:" + st.indexOf('N')); 
         System.out.println("Character at index no 7 is: "+ st.charAt(7)); 
         System.out.println("String contains 'Is' or not : " + st.contains("Is"));
     
      
}     
}  