import java.util.Scanner;
public class Solution {

    public static int linearSearch(int arr[], int x) {
		  int n=arr.length;
      int value;
      for(int i=0;i<n;i++)
      {
        if (arr[i]==x)
        {
          value=arr[i];
          return i;
        }
        
        
        
      }
      return -1;
      
    }
}    
   
