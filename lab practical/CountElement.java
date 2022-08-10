class CountElement
{
public static void main(String[] args)
 { 
int [] arr = new int [] {3,7,5,5,9,2,9,3,7}; int Count=0;
System.out.println("Duplicate elements in array: ");  
for(int i = 0; i < arr.length; i++) 
{ 
for(int j = i + 1; j < arr.length; j++) 

{ 
if(arr[i] == arr[j]) 
{ System.out.println(arr[j]); Count++;
 }
 }
 } 
System.out.println("count of repeated values"+Count);
}
}