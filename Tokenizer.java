import java.util.StringTokenizer;
 
class Tokenizer{
	
		public static void main(String[] args)
		{
                       StringTokenizer st = new StringTokenizer("i am a women"," ");
                       StringTokenizer mt = new StringTokenizer("Today is monday"," ");
                       while(st.hasMoreTokens()){
                               System.out.println(st.nextToken());
                       }    
                       while(mt.hasMoreTokens()){ 
                               System.out.println(mt.nextToken());
                       }
                 }
  }        