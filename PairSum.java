public class Solution 
{  
    public static int pairSum(int input[], int x) {
        int cnt=0;
        
        for(int i=0;i<input.length;i++) 
        {
            
            for(int j=i+1;j<input.length;j++)
            {
				if(input[i] + input[j] == x) 
                {
					cnt++;
				}
			}
		}
        return cnt;
    }

}
