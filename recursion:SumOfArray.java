public class Solution {

	public static int sum(int input[]) {
		if(input.length==1)
		{
			return input[0];
		}
		
		int small[]=new int[input.length-1];
		for(int i=1;i<input.length;i++){
			small[i-1]=input[i];
		}
		int smallSum=sum(small);
        int sum=input[0]+smallSum;
		return sum;
		
	}
}
