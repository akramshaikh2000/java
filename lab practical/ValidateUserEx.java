import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateUserEx
{

	public static void main(String[] args) 
  {
         Scanner s=new Scanner(System.in);

        System.out.println("Enter your username");
        String username=s.next();
        
        System.out.println(Pattern.matches("[_a-zA-Z0-9]{6,30}",username));

        System.out.println("Enter your email id");
        String emailid=s.next();
        System.out.println(Pattern.matches("[_a-zA-Z0-9@$%#.]{6,30}", emailid));

        System.out.println("Enter your password");
        String password=s.next();
        System.out.println(Pattern.matches("[_a-zA-Z0-9@#$%&]{8,16}", password));
  }
}