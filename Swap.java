class Swap
{
      
        int num1=10,num2=20,temp;
        public void swap()
        {

                System.out.println("before swapping:num1= "+num1);
                System.out.println("num2= "+num2);
                temp=num1;
                num1=num2;
                num2=temp;
                System.out.println("after swapping:num1= "+num1);
                System.out.println("num2= "+num2);
         }
}