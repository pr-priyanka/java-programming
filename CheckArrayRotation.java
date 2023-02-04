public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	int n = arr.length;
	        int ans = 0;
	        for(int i = 0;i<n-1;i++)
	        	
	        {
	        	if(arr[i]<arr[i+1])
	        	{
	        		continue;
	        	}
	        	else
	        		ans+= i+1;
	        }
	        return ans;
    }

}
