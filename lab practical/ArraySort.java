import java.util.Arrays;
 
class ArraySort {
    
    static void segregateElements(int arr[], int n)
    {
         
        
        int temp[] = new int[n];
 
      
        int j = 0; 
         
        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];
 
       
        if (j == n || j == 0)
            return;
 
        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];
 
        
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
     
   
    public static void main(String arg[])
    {
        int arr[] = {12, -1, -3, -2, -9, 5, 11, 1 };
        int n = arr.length;
 
        segregateElements(arr, n);
 
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}