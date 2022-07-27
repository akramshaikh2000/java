class Stringtopic
{
       public static void main(String[] args)
       {
              String str = "Mohammed";
              int length = str.length();
              System.out.println("length of string:"+length);
              System.out.println("letter at index position 3:"+str.charAt(3));
              System.out.println("contains method:"+str.contains("amm"));
              System.out.println("Lower Case:"+str.toLowerCase());
              System.out.println("Upper Case:"+str.toUpperCase());
              System.out.println("substring method:"+str.substring(3,5));
              System.out.println("replace method:"+str.replace('o','u'));
         }
}