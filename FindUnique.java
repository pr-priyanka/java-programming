public class Solution{  

     public static int findUnique(int[] arr){
       int size=arr.length;
       int j;
        for(int i=0;i<size;i++)
        { 
            for(j=0;j<size;j++)
            {
               if(i!=j && arr[i]==arr[j])
                break;
            }
            if(j==arr.length)
                return arr[i];   
        }
		  return -1;
	}
}
