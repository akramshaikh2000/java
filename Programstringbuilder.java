import java.lang.StringBuilder;
 
class Programstringbuilder
	{
		public static void main(String[] args)
		 {
			StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 4; i++)
			{
			builder.append("xyz ");
			}
		String result = builder.toString();
		System.out.println(result);
		}
	}